package com.example.demoApi.services;
import com.example.demoApi.dto.Employeedto;
import com.example.demoApi.entities.EmployeeEntities;
import com.example.demoApi.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;
    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }
    public Employeedto getEmployeeByID(Long id){

        EmployeeEntities employeeEntities =  employeeRepository.getById(id);
        return modelMapper.map(employeeEntities, Employeedto.class);

    }
    public Employeedto createNewEmployee(Employeedto employeedto) {

     EmployeeEntities employeeEntities = modelMapper.map(employeedto, EmployeeEntities.class);
     return  modelMapper.map(employeeRepository.save(employeeEntities),Employeedto.class);

    }
    public List<Employeedto> getAllEmployees() {

        List<Employeedto> list = new ArrayList<>();

        for(EmployeeEntities employeeEntities : employeeRepository.findAll()){

        Employeedto map = modelMapper.map(employeeEntities, Employeedto.class);
        list.add(map);

        }
          return  list;
    }

    public boolean deleteEmployeeById(Long id) {

        boolean isPresent = employeeRepository.existsById(id);
        if (!isPresent){
           return false;
        }

        employeeRepository.deleteById(id);
        return true;
    }
}
