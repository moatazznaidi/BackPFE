package com.example.stagepfe.Controller;
import com.example.stagepfe.Service.TaskService;
import com.example.stagepfe.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping("")

    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @PostMapping("/add")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/modify")
    public Task modifyTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

