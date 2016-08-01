package org.boutwaretech.weightspec.services.iface;

import org.boutwaretech.weightspec.domain.BodyMeasurementTransaction;
import org.boutwaretech.weightspec.domain.Person;
import org.boutwaretech.weightspec.domain.Team;

public interface TeamService<T extends Team<? extends Person>> {
    
    Iterable<T> listAllTeams();
    
    T getTeam(String teamId);
    
    T getTeamWithAthletes(String teamId);
    
    Iterable<BodyMeasurementTransaction> getTransactionsByTeam(String teamId);
}
