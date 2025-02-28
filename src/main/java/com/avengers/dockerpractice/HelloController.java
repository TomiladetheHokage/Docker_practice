package com.avengers.dockerpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class HelloController {

    @Autowired
    UserRepo userRepository;

    @GetMapping("/hello")
    public String hello() {
        return ("Hello World");
    }

    @PostMapping("/create")
        public String create(@RequestBody User user){
            userRepository.save(user);
            return ("Saved succesfully");
        }
    }

