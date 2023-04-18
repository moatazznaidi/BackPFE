package com.example.stagepfe.Repository;

import com.example.stagepfe.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
