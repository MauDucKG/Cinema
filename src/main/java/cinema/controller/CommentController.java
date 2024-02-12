package cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import cinema.model.Comment;
import cinema.service.CommentService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comment_register")
    public String commentRegister() {
        return "commentRegister";
    }

    @GetMapping("/available_comments")
    public ModelAndView getAllComments() {
        List<Comment> commentList = commentService.getAllComments();
        return new ModelAndView("commentList", "comment", commentList);
    }

    @PostMapping("/saveComment")
    public String addComment(@ModelAttribute Comment comment) {
        commentService.save(comment);
        return "redirect:/available_comments";
    }

    @RequestMapping("/editComment/{id}")
    public String editComment(@PathVariable("id") int id, Model model) {
        Comment comment = commentService.getCommentById(id);
        model.addAttribute("comment", comment);
        return "commentEdit";
    }

    @RequestMapping("/deleteComment/{id}")
    public String deleteComment(@PathVariable("id") int id) {
        commentService.deleteById(id);
        return "redirect:/available_comments";
    }
}
