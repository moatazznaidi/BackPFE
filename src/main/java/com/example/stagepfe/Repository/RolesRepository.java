package com.example.stagepfe.Repository;

import com.example.stagepfe.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository <Role, Long>{
}
