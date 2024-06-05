package com.example.demoApi.controllers;

import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class EmployeesController {
    
//Controller
// GET
// POST
// DELETE

private String name;

private Long id;

private  LocalDate joiningDate;

private boolean isActive;

public EmployeesController(String name, Long id, LocalDate joiningDate, boolean isActive) {
    this.name = name;
    this.id = id;
    this.joiningDate = joiningDate;
    this.isActive = isActive;
}

public void setName(String name) {
    this.name = name;
}

public void setId(Long id) {
    this.id = id;
}

public void setJoiningDate(LocalDate joiningDate) {
    this.joiningDate = joiningDate;
}

public void setActive(boolean isActive) {
    this.isActive = isActive;
}

public String getName() {
    return name;
}

public Long getId() {
    return id;
}

public LocalDate getJoiningDate() {
    return joiningDate;
}

public boolean isActive() {
    return isActive;
}





}
