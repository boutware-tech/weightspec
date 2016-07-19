package org.boutwaretech.weightspec.services.iface;

import org.boutwaretech.weightspec.domain.Person;
import org.boutwaretech.weightspec.domain.BodyMeasurementTransaction;
import org.boutwaretech.weightspec.domain.Team;

public interface TeamService<T extends Team> {
    
    Iterable<T> listAllTeams();
    
    Team getTeam(String teamId);
    
    Iterable<Person> getAthletesByTeam(String teamId);
    
    Iterable<BodyMeasurementTransaction> getTransactionsByTeam(String teamId);
}
