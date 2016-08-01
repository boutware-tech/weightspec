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
public class TeamServiceMemoryImpl implements TeamService<Team<Person>> {

    @Override
    public Iterable<Team<Person>> listAllTeams() {
        List<Team<Person>> list = new ArrayList<>();
        list.add(new Team<Person>("111", "North High School", "Omaha", "NE", "1111"));
        list.add(new Team<Person>("112", "South High School", "Austin", "TX", "1112"));
        list.add(new Team<Person>("113", "East High School", "Philadelphia", "PA", "1113"));
        list.add(new Team<Person>("114", "West High School", "Seattle", "WA", "1114"));
        return list;
    }

    @Override
    public Team<Person> getTeam(String teamId) {
        Team<Person> team = new Team<>("111", "North High School", "Omaha", "NE", "1111");
        return team;
    }

    @Override
    public Iterable<BodyMeasurementTransaction> getTransactionsByTeam(String teamId) {
        List<BodyMeasurementTransaction> list = new ArrayList<>();
        return list;
    }

    @Override
    public Team<Person> getTeamWithAthletes(String teamId) {
        // TODO Auto-generated method stub
        return null;
    }
}
