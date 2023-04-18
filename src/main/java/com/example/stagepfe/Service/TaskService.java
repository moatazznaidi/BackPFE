package com.example.stagepfe.Service;

import com.example.stagepfe.models.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAllTasks();
    public List<TaskService> getTasksById(Long id);
    public Task saveTask(Task task);

    public void deleteTask(Long id);}

