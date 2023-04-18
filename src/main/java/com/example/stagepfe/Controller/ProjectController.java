package com.example.stagepfe.Controller;
import com.example.stagepfe.Service.ProjectService;
import com.example.stagepfe.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("")
    public List<Project> getAllProject() {
        return projectService.getAllProject();
    }


    @PostMapping("/add")
    public Project saveProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }

    @PutMapping ("/modify")
    public Project modifyProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }

//        @PutMapping(value = "/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Project ModifProject(@RequestBody Project project) {
//        return projectService.saveProject(project);
//    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteProject(@PathVariable("id") Long id) {
        projectService.deleteProject(id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
