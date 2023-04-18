package com.example.stagepfe.Service.imp;

import com.example.stagepfe.Repository.RolesRepository;
import com.example.stagepfe.Service.RoleService;
import com.example.stagepfe.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RolesInterfacemp implements RoleService {
    @Autowired
    RolesRepository rolesRepository;
    public List<Role> getAllRoles() {
        return rolesRepository.findAll();
    }

    public Role getRolesById(Long id) {
        return rolesRepository.findById(id).orElse(null);
    }

    public Role saveRoles(Role roles) {
        return rolesRepository.save(roles);
    }

    public void deleteRoles(Long id) {
        rolesRepository.deleteById(id);
    }

}

