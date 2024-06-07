package com.example.demoApi.controllers;

import com.example.demoApi.dto.Employeedto;
import com.example.demoApi.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/employees")
public class EmployeesController {

    private final EmployeeService employeeService;
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employeedto> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping ("/{id}")
    public Employeedto getEmployeeById(@PathVariable("id") Long id){

        return employeeService.getEmployeeByID(id);
        //return  new Employeedto(id,"Shadman", LocalDate.of(2024, 01, 16),true);

    }
    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployessById(@PathVariable Long id){

       return  employeeService.deleteEmployeeById(id);

    }
    @PostMapping
    public Employeedto createNewEmployee(@RequestBody Employeedto employeedto){

        return employeeService.createNewEmployee(employeedto);
        //return  new Employeedto(id,"Shadman", LocalDate.of(2024, 01, 16),true);

    }



//    @GetMapping ("/employees")
//    public String getEmployeedata(@PathParam("sortBy")String sortBy, @PathParam("limit")Integer limit){
//
//        return  "Hello "+sortBy+" "+limit;
//
//    }
}
