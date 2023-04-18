package com.example.stagepfe.Service.imp;
import com.example.stagepfe.Repository.TasksProjectRepository;
import com.example.stagepfe.Service.TasksProjectService;
import com.example.stagepfe.models.TasksProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public  class TasksProjectInterfaceImp implements TasksProjectService {
    @Autowired
 private   TasksProjectRepository tasksProjectRepository;

    @Override
    public List<TasksProject> getAllTasksProject() {
        return tasksProjectRepository.findAll();
    }
    @Override

    public TasksProject getTasksProjectById(Long id)
    {
        return  tasksProjectRepository.findById(id).orElse(null);
    }
    @Override

    public TasksProject saveTasksProject(TasksProject tasksProject)
    {
        return tasksProjectRepository.save(tasksProject);
    }
    @Override

    public void deleteTasksProject(Long id) {tasksProjectRepository.deleteById(id);
    }

}