package com.org.cts.service;

import com.org.cts.model.Patient;
import com.org.cts.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    PatientRepo  patientRepo;
    @Override
    public void createPatient(Patient patient) {
        patientRepo.save(patient);
    }

    @Override
    public Patient findById(long id) {
        Patient patient=  patientRepo.findByPatientId(id);
        return patient;
    }

    @Override
    public Patient findByPhoneNumber(double phoneNumber) {
        Patient patient1=   patientRepo.findByPhoneNumber(phoneNumber);
        return patient1;
    }

    @Override
    public Patient findByLastNameAndDob(String lastName, Date dob) {
        return patientRepo.findByLastNameAndDateOfBirth(lastName,dob);
    }


}

