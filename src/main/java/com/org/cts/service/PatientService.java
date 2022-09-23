package com.org.cts.service;

import com.org.cts.model.Patient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;

public interface PatientService {
    public void createPatient( Patient patient);
    public Patient findById ( long id);
    public Patient findByPhoneNumber( double phoneNumber);
    public Patient findByLastNameAndDob( String lastName, Date dob);

    }
