package com.example.stagepfe.Service.imp;

import com.example.stagepfe.Repository.TeamsRepository;
import com.example.stagepfe.Service.TeamsService;
import com.example.stagepfe.models.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TeamsInterfaceImp implements TeamsService {
    @Autowired
    TeamsRepository teamsRepository;

    public List<Teams> getAllTeams() {
        return teamsRepository.findAll();
    }

    public Teams getTeamsById(Long id) {
        return teamsRepository.findById(id).orElse(null);
    }

    public Teams saveTeams(Teams teams) {
        return teamsRepository.save(teams);
    }

    public void deleteTeams(Long id) {
        teamsRepository.deleteById(id);
    }
}
