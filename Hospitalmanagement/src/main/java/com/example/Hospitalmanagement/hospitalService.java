package com.example.Hospitalmanagement;

import java.util.List;



public interface hospitalService {
  public String createPatientDetails(HospitalDetails hospital);
  public String updatePatientDetails(HospitalDetails hospital);
  public String getPatientDetails( String patientId);
  public String deletePatientDetails(String patientId);
  public List <HospitalDetails> getAllPatientDetails();

}
