package com.example.stagepfe.Service;
import com.example.stagepfe.models.Project;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ProjectService {
    public List<Project> getAllProject();
    public Project getProjectById(Long id);
    public Project saveProject(Project project);

    public void deleteProject(Long id);
}
