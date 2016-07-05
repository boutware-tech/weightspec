package org.boutwaretech.weightspec.controllers;

import org.boutwaretech.weightspec.services.iface.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/teams")
public class TeamController {

    private TeamService teamService;

    @Autowired
    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("teams", teamService.listAllTeams());
        return "teams";
    }
    
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String team(Model model, @PathVariable("id") Long teamId) {
        model.addAttribute("team", teamService.getTeam(teamId));
        model.addAttribute("athletes", teamService.getAthletesByTeam(teamId));
        model.addAttribute("transactions", teamService.getTransactionsByTeam(teamId));
        return "team";
    }
}
