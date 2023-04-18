package com.example.stagepfe.Controller;
import com.example.stagepfe.Service.RoleService;

import com.example.stagepfe.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping("")
    public List<Role> getAllRole() {
        return roleService.getAllRoles();
    }

    @PostMapping("/add")
    public Role saveRoles(@RequestBody Role role) {
        return roleService.saveRoles(role);
    }

    @PutMapping ("/modify")
    public Role modifyRoles(@RequestBody Role role) {
        return roleService.saveRoles(role);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteRoles(@PathVariable("id") Long id) {
        roleService.deleteRoles(id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


