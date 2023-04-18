package com.example.stagepfe.Service.imp;

import com.example.stagepfe.Repository.TaskRepository;
import com.example.stagepfe.Service.TaskService;
import com.example.stagepfe.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TaskInterfaceImp implements TaskService {
    @Autowired
    TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<TaskService> getTasksById(Long id) {
        return (List<TaskService>) taskRepository.findById(id).orElse(null);
    }

    public Task saveTask(Task Task) {
        return taskRepository.save(Task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
