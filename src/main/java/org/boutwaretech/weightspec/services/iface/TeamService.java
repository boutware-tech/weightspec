package org.boutwaretech.weightspec.services.iface;

import org.boutwaretech.weightspec.domain.Athlete;
import org.boutwaretech.weightspec.domain.BodyMeasurementTransaction;
import org.boutwaretech.weightspec.domain.Team;

public interface TeamService {
    
    Iterable<Team> listAllTeams();
    
    Team getTeam(Long teamId);
    
    Iterable<Athlete> getAthletesByTeam(Long teamId);
    
    Iterable<BodyMeasurementTransaction> getTransactionsByTeam(Long teamId);
}
