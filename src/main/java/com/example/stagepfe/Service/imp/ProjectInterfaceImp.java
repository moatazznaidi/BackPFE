package com.example.stagepfe.Service.imp;

import com.example.stagepfe.Repository.ProjectRepository;
import com.example.stagepfe.Service.ProjectService;
import com.example.stagepfe.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProjectInterfaceImp implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    public List<Project> getAllProject()  {return projectRepository.findAll();}

    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
