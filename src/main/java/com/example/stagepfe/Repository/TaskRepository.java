package com.example.stagepfe.Repository;
import com.example.stagepfe.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}