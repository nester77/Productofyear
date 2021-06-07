package com.bsuir.productofyear.controllers;

import com.bsuir.productofyear.entity.User;
import com.bsuir.productofyear.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping("/users")
    public String getAllUsers(ModelMap modelMap){
        List<User> users = userRepository.findAll();
        modelMap.addAttribute("users", users);
        return "users";
    }

    @RequestMapping("/user-new")
    public String addUser(ModelMap modelMap){
        User user = new User();
        modelMap.addAttribute("user", user);
        return "user-new";
    }

    @RequestMapping("/user-save")
    public String saveUser(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return "success";
    }



        @GetMapping("/success")
    public String home(Model model) {
        model.addAttribute("title", "Спасибо за обращение");
        return "success";
    }



}
