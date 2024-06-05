package com.example.demoApi.dto;

import java.time.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employeedto {
    
private String name;

private Long id;

private  LocalDate joiningDate;

private boolean isActive;
}
