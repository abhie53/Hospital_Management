package com.example.Hospitalmanagement;


import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class hospitalServiceImpl implements hospitalService {
    hospitalRepo repo;
    public hospitalServiceImpl(hospitalRepo repo) {
        this.repo = repo;
    }

    @Override
    public String createPatientDetails(HospitalDetails hospital) {
        repo.save(hospital);
        return "Created Successfully";
    }

    @Override
    public String updatePatientDetails(HospitalDetails hospital) {
        repo.save(hospital);
        return "Updated Successfully";
    }

    @Override
    public String getPatientDetails(String patientId) {
        repo.findById(patientId);
        return " Successfully got Patient";
    }

    @Override
    public String deletePatientDetails(String patientId) {
        repo.deleteById(patientId);
        return " Successfully Deleted";
    }

    @Override
    public List<HospitalDetails> getAllPatientDetails() {
        return repo.findAll();
    }
    
}
