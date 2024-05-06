package com.example.Hospitalmanagement;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HospitalDetails")

public class hospitalController {
   hospitalService service;

public hospitalController(hospitalService service) {
    this.service = service;
}

    @GetMapping("{patientId}")
    public String getPatientDetails(@PathVariable ("patientId") String patientId){
        return service.getPatientDetails(patientId);
        
    }
    @GetMapping
    public List <HospitalDetails> getPatientDetails(){
        return service.getAllPatientDetails();
    }
    
    @PostMapping
    public String createPatient(@RequestBody HospitalDetails patient){
         return service.createPatientDetails(patient);
        //  return "Created Successfully.";
    }
    
    @PutMapping
    public String updatePatient(@RequestBody HospitalDetails patient){
        service.updatePatientDetails(patient);
        return "Updeted Successfully.";
    }

    @DeleteMapping("{patientId}")
    public String deletePatientDetails(@PathVariable ("patientId") String patientId){
        service.deletePatientDetails(patientId);
        return "Success";
    }
}

