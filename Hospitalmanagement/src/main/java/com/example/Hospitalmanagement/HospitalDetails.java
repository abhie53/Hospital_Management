package com.example.Hospitalmanagement;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patientInfo")


public class HospitalDetails {
    @Id
   private String hospitalName;
   private String patientId;
   private String patientName;
   private String patientAdd;
   private String patientBill;
public HospitalDetails() {
}
public HospitalDetails(String hospitalName, String patientId, String patientName, String patientAdd,
        String patientBill) {
    this.hospitalName = hospitalName;
    this.patientId = patientId;
    this.patientName = patientName;
    this.patientAdd = patientAdd;
    this.patientBill = patientBill;
}
public String getHospitalName() {
    return hospitalName;
}
public void setHospitalName(String hospitalName) {
    this.hospitalName = hospitalName;
}
public String getPatientId() {
    return patientId;
}
public void setPatientId(String patientId) {
    this.patientId = patientId;
}
public String getPatientName() {
    return patientName;
}
public void setPatientName(String patientName) {
    this.patientName = patientName;
}
public String getPatientAdd() {
    return patientAdd;
}
public void setPatientAdd(String patientAdd) {
    this.patientAdd = patientAdd;
}
public String getPatientBill() {
    return patientBill;
}
public void setPatientBill(String patientBill) {
    this.patientBill = patientBill;
}
}
