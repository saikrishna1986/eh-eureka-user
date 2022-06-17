package com.citi.user.controller;

import com.citi.user.model.User;
import com.citi.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @PostMapping("/creates-new-user")
    public User createUser(@RequestBody User user){
      return userRepository.save(user);
    }


    @GetMapping("/getall-users")
    public List<User> getUsersInfo(){
        return userRepository.findAll();

    }
    @GetMapping("/getall-usersbyacctype")
    public List<User> getUsersByAccountType(@RequestParam String AccType){
        return userRepository.findByAccount(AccType);
    }
    @GetMapping("/getusers")
    public List<User> getUsers(@RequestParam String AccType){
        List<User> user = userRepository.findAll();
        return user.stream().filter(u->u.getAccount().equals("savings")).collect(Collectors.toList());
    }
    @GetMapping("/getucercountbyaccout")
    public Map<String, Long> gettotalUsersByAccount(){
        List<User> user = userRepository.findAll();
        return  user.stream().collect(Collectors.groupingBy(User::getAccount, Collectors.counting()));
    }
    @GetMapping("/getalluserbySorted")
    public List<User> getUser(){
        List<User> all = userRepository.findAll();
       // Collections.sort(all,(u1,u2)->u1.getName().compareTo(u2.getName()));
        if(!all.isEmpty()){
            all=  all.stream().sorted((u1,u2)->u1.getName().compareTo(u2.getName())).collect(Collectors.toList());
        }
        return all;
    }


    //write an api to get all user based on account type.

    //write an api to get user based on  country

    //write an api which return user count based on country.



}
