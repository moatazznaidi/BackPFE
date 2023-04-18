package com.example.stagepfe.Repository;
import com.example.stagepfe.models.TasksProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TasksProjectRepository extends JpaRepository<TasksProject, Long> {
}