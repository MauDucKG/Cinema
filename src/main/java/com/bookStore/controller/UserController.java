package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.User;
import com.bookStore.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user_register")
    public String userRegister() {
        return "userRegister";
    }

    @GetMapping("/available_users")
    public ModelAndView getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return new ModelAndView("userList", "user", userList);
    }

    @PostMapping("/saveUser")
    public String addUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/available_users";
    }

    @RequestMapping("/editUser/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "userEdit";
    }

    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteById(id);
        return "redirect:/available_users";
    }
}
