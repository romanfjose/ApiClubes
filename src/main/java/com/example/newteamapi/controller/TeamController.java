package com.example.newteamapi.controller;

import com.example.newteamapi.model.Team;
import com.example.newteamapi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("apiTeam/v1")
@RestController
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/teams")
    public List<Team> getTeams(){
        return teamService.getTeams();
    }

    @PostMapping("/addTeam")
    public Team createTeam(@RequestBody Team team){
        return teamService.createTeam(team);
    }

    @DeleteMapping("/deleteTeam/{id}")
    public void deleteTeam(@PathVariable Integer id){
        teamService.deleteTeam(id);
    }

    @PutMapping("/updateTeam")
    public Team updateTeam(@RequestBody Team team){
        return teamService.updateTeam(team);
    }
}
