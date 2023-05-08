package com.workshop_api.workshop_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.workshop_api.workshop_api.entities.Users;
import com.workshop_api.workshop_api.services.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUsers")
    public List<Users> getUserDetails(){
        return userService.getUserDetails();
    }

    @PostMapping("/addUser")
    public Users addUser(
        @RequestParam("name") String name,
        @RequestParam("phone") String phone,
        @RequestParam("mail") String mail
    ){
        Users user = new Users(0, name, phone, mail);
        return userService.addUser(user);
    }


}
