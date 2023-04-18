package com.example.stagepfe.Repository;

import com.example.stagepfe.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
