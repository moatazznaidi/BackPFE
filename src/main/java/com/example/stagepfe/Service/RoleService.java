package com.example.stagepfe.Service;

import com.example.stagepfe.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    public List<Role> getAllRoles();
    public Role getRolesById(Long id);

    public Role saveRoles(Role roles);

    public void deleteRoles(Long id);}

