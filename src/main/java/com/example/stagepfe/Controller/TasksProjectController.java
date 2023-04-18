package com.example.stagepfe.Controller;


import com.example.stagepfe.Service.TasksProjectService;
import com.example.stagepfe.models.TasksProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tasksproject")
public class TasksProjectController {
    @Autowired
    private TasksProjectService tasksProjectService;

    @GetMapping("")

    public List<TasksProject> getAllTasksProject() {
        return tasksProjectService.getAllTasksProject();
    }
    @PostMapping("/add")
    public TasksProject saveTasksProject(@RequestBody TasksProject tasksProject) {
        return tasksProjectService.saveTasksProject(tasksProject);
    }

    @PutMapping("/modify")
    public TasksProject modifyTask(@RequestBody TasksProject tasksProject) {
        return tasksProjectService.saveTasksProject(tasksProject);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteTasksProject(@PathVariable("id") Long id) {
        tasksProjectService.deleteTasksProject(id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
