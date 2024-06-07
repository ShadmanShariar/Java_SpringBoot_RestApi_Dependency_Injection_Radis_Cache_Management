package com.example.demoApi.dto;
import java.time.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employeedto {
        private Long id;
        private String name;
        private  LocalDate joiningDate;
        @JsonProperty("isActive")
        private boolean isActive;
}
