package com.elearning.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.model.User;
import com.elearning.repositories.UserRepository;
 


@RestController
@RequestMapping(value = "/app")
public class ApplicationController {
     
    Logger logger = LoggerFactory.getLogger(getClass());
     
    @Autowired
    private MongoTemplate mongoTemplate;
     
    @Autowired
    private UserRepository userRepository;
 
    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<User> getAllStudents() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
        	System.out.println("Users" + user.getMobileNumber());

		}
        return users;
    }
}