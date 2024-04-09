package com.example.demo.restdemo.ModelDomain;
/**
 * Domæne- eller modelklasse for en bruger.
 * Indeholder brugerens data såsom id og navn.
 */
public class User {
 private String id;
 private String name;
 // Constructor, getters, and setters
 /**
  * Konstruktør for brugerobjektet.
  * @param id Brugerens ID.
  * @param name Brugerens navn.
  */
 public User(String id, String name) {
 this.id = id;
 this.name = name;
 }
 // getters and setters

 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }
}
