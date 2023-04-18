package com.example.stagepfe.Controller;
import com.example.stagepfe.Service.SprintService;
import com.example.stagepfe.models.Sprint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sprint")
public class SprintController {

    @Autowired
    private SprintService sprintService;
    @GetMapping("")
    public List<Sprint> getAllSprint() {
        return sprintService.getAllSprints();
    }

    @PostMapping("/add")
    public Sprint saveSprint(@RequestBody Sprint sprint) {
        return sprintService.saveSprint(sprint);
    }

    @PutMapping("/modify")
    public Sprint modifyRoles(@RequestBody Sprint sprint) {
        return sprintService.saveSprint(sprint);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteSprint(@PathVariable("id") Long id) {
        sprintService.deleteSprint(id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


