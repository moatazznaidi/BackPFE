package com.example.stagepfe.Controller;
import com.example.stagepfe.Service.CommentsService;
import com.example.stagepfe.models.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    CommentsService commentsService;



    @GetMapping("")
    public List<Comments> getAllComments() {
        return commentsService.getAllComments();
    }


    @PostMapping("/add")
    public Comments saveComments(@RequestBody Comments comments) {
        return commentsService.saveComments(comments);
    }

    @PutMapping("/modify")
    public Comments ModifComments(@RequestBody Comments comments) {
        return commentsService.saveComments(comments);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteComments(@PathVariable("id") Long id) {
        commentsService.deleteComments(id) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
