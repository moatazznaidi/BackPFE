package com.example.stagepfe.Service;
import com.example.stagepfe.models.Teams;


import java.util.List;

public interface TeamsService {
    public List<Teams> getAllTeams();
    public Teams getTeamsById(Long id);

    public Teams saveTeams(Teams teams);

    public void deleteTeams(Long id);}


