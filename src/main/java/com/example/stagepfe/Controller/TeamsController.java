package com.example.stagepfe.Controller;

import com.example.stagepfe.Service.TeamsService;
import com.example.stagepfe.models.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamsController {

    @Autowired
    private TeamsService teamsService;

    @GetMapping("")
    public List<Teams> getAllTeams() {
        return teamsService.getAllTeams();
    }


    @PostMapping("/add")
    public Teams saveTeams(@RequestBody Teams teams) {
        return teamsService.saveTeams(teams);
    }

    @PutMapping("/modify")
    public Teams ModifTeams(@RequestBody Teams teams) {
        return teamsService.saveTeams(teams);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteTeams(@PathVariable("id") Long id) {
        teamsService.deleteTeams(id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
