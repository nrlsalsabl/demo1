package com.example.demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Long id;
 private String firstName;
 private String lastName;

 public Customer() {
    
 }

 public Customer(String firstname, String lastname) {
    this.firstName = firstname;
    this.lastName = lastname;
 }
 

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
 
 
 }
