package com.example.stagepfe.Service.imp;

import com.example.stagepfe.Repository.CommentsRepository;
import com.example.stagepfe.Service.CommentsService;
import com.example.stagepfe.models.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentsInterfaceImp implements CommentsService {
@Autowired
    CommentsRepository commentsRepository;

    @Override

    public List<Comments> getAllComments() {
        return commentsRepository.findAll();
    }


    public Comments getCommentsById(Long id) {
        return commentsRepository.findById(id).orElse(null);
    }
    @Override

    public Comments saveComments(Comments comments) {
        return commentsRepository.save(comments);
    }
    @Override

    public void deleteComments(Long id) {
        commentsRepository.deleteById(id);
    }
}
