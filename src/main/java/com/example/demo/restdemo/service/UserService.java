package com.example.demo.restdemo.service;


import com.example.demo.restdemo.ModelDomain.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Serviceklasse til håndtering af brugerdata.
 * Denne klasse indeholder forretningslogikken til at administrere brugere.
 */
@Service
public class UserService {
 private final List<User> users = new ArrayList<>();

 /**
  * Tilføjer en ny bruger til listen.
  * @param id Brugerens ID.
  * @param name Brugerens navn.
  * @return Den nytilføjede bruger.
  */
 public User addUser(String id, String name) {
 User newUser = new User(id, name);
 users.add(newUser);
 return newUser;
 }

 /**
  * Henter alle brugere fra listen.
  * @return En liste af brugere.
  */
 public List<User> getAllUsers() {
 return users;
 }
}