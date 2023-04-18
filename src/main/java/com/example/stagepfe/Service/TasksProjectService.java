package com.example.stagepfe.Service;
import com.example.stagepfe.models.TasksProject;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface TasksProjectService {
    public List<TasksProject> getAllTasksProject();
    public TasksProject getTasksProjectById(Long id);
    public TasksProject saveTasksProject(TasksProject tasksProject);
    public void deleteTasksProject(Long id);}



