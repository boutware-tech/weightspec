package org.boutwaretech.weightspec.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.domain.Athlete;
import org.boutwaretech.weightspec.domain.BodyMeasurementTransaction;
import org.boutwaretech.weightspec.domain.Team;
import org.boutwaretech.weightspec.services.iface.TeamService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Implementation of TeamService that is for development and uses
 * an in-memory database.
 *
 */
@Profile(Profiles.FAKE_TEAMSVC)
@Service
public class TeamServiceMemoryImpl implements TeamService {

    @Override
    public Iterable<Team> listAllTeams() {
        List<Team> list = new ArrayList<>();
        list.add(new Team(111L, "North High School", "Omaha", "NE", 1111L));
        list.add(new Team(112L, "South High School", "Austin", "TX", 1112L));
        list.add(new Team(113L, "East High School", "Philadelphia", "PA", 1113L));
        list.add(new Team(114L, "West High School", "Seattle", "WA", 1114L));
        return list;
    }

    @Override
    public Team getTeam(Long teamId) {
        Team team = new Team(111L, "North High School", "Omaha", "NE", 1111L);
        return team;
    }

    @Override
    public Iterable<Athlete> getAthletesByTeam(Long teamId) {
        List<Athlete> list = new ArrayList<>();
        list.add(new Athlete(111L, "Alan", "Alanson", "2000/01/01", "M", teamId));
        list.add(new Athlete(112L, "Bob", "Bobson", "2000/02/01", "M", teamId));
        list.add(new Athlete(113L, "Carl", "Carlson", "2000/03/05", "M", teamId));
        list.add(new Athlete(114L, "David", "Davidson", "2000/03/05", "M", teamId));
        list.add(new Athlete(115L, "Evan", "Evanson", "2000/02/21", "M", teamId));
        list.add(new Athlete(116L, "Frank", "Frankson", "2000/01/21", "M", teamId));
        list.add(new Athlete(117L, "Greg", "Gregson", "2000/02/21", "M", teamId));
        list.add(new Athlete(118L, "Harry", "Harrison", "2000/03/11", "M", teamId));
        list.add(new Athlete(119L, "Ivan", "Ivanson", "2000/02/11", "M", teamId));
        list.add(new Athlete(120L, "Jack", "Jackson", "2000/01/11", "M", teamId));
        return list;
    }

    @Override
    public Iterable<BodyMeasurementTransaction> getTransactionsByTeam(Long teamId) {
        List<BodyMeasurementTransaction> list = new ArrayList<>();
        return list;
    }
}
