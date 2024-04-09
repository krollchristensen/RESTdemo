package com.example.demo.restdemo.controller;


import com.example.demo.restdemo.ModelDomain.User;
import com.example.demo.restdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controller klasse til håndtering af brugerdata.
 * Denne klasse behandler HTTP-anmodninger og -svar relateret til brugeroperationer.
 */

@RestController
@RequestMapping("/users")
public class UserController {
 private final UserService userService;

 /**
  * Konstruktør til automatisk at koble UserService afhængigheden.
  * @param userService Brugerservice, der håndterer forretningslogikken.
  */
 @Autowired
public UserController(UserService userService) {
 this.userService = userService;
 }

 /**
  * Tilføjer en ny bruger baseret på givne parametre.
  * @param id Brugerens ID.
  * @param name Brugerens navn.
  * @return Den tilføjede bruger.
  */
 @PostMapping
 public User addUser(@RequestParam String id, @RequestParam String name) {
 return userService.addUser(id, name);
 }

 /**
  * Henter alle brugere.
  * @return En liste af brugere.
  */

 @GetMapping
 public List<User> getAllUsers() {
 return userService.getAllUsers();
 }
}