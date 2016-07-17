package org.boutwaretech.weightspec.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.domain.Person;
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
        list.add(new Team("111", "North High School", "Omaha", "NE", "1111"));
        list.add(new Team("112", "South High School", "Austin", "TX", "1112"));
        list.add(new Team("113", "East High School", "Philadelphia", "PA", "1113"));
        list.add(new Team("114", "West High School", "Seattle", "WA", "1114"));
        return list;
    }

    @Override
    public Team getTeam(String teamId) {
        Team team = new Team("111", "North High School", "Omaha", "NE", "1111");
        return team;
    }

    @Override
    public Iterable<Person> getAthletesByTeam(String teamId) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("111", "Alan", "Alanson", "2000/01/01", "M", teamId));
        list.add(new Person("112", "Bob", "Bobson", "2000/02/01", "M", teamId));
        list.add(new Person("113", "Carl", "Carlson", "2000/03/05", "M", teamId));
        list.add(new Person("114", "David", "Davidson", "2000/03/05", "M", teamId));
        list.add(new Person("115", "Evan", "Evanson", "2000/02/21", "M", teamId));
        list.add(new Person("116", "Frank", "Frankson", "2000/01/21", "M", teamId));
        list.add(new Person("117", "Greg", "Gregson", "2000/02/21", "M", teamId));
        list.add(new Person("118", "Harry", "Harrison", "2000/03/11", "M", teamId));
        list.add(new Person("119", "Ivan", "Ivanson", "2000/02/11", "M", teamId));
        list.add(new Person("120", "Jack", "Jackson", "2000/01/11", "M", teamId));
        return list;
    }

    @Override
    public Iterable<BodyMeasurementTransaction> getTransactionsByTeam(String teamId) {
        List<BodyMeasurementTransaction> list = new ArrayList<>();
        return list;
    }
}
