package com.example.stagepfe.Service;
import com.example.stagepfe.models.Comments;
import java.util.List;

public interface CommentsService {
    public List<Comments> getAllComments();
    public Comments getCommentsById(Long id);

    public Comments saveComments(Comments comments);

    public void deleteComments(Long id);}

