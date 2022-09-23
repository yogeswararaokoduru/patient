package com.org.cts.controller;

import com.org.cts.model.Patient;
import com.org.cts.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/api")
public class PatientController {
    @Autowired
    PatientService patientService;
    // CRUD OPERATIONS //
    @PostMapping("/create")
    public void createPatient(@RequestBody Patient patient){
        patientService.createPatient(patient);
    }
    @GetMapping("/getById/{id}")
    public Patient findById(@PathVariable long id){
        Patient patient=  patientService.findById(id);
        return patient;
    }
    @GetMapping("/getByPhoneNumber/{phoneNumber}")
    public Patient findByPhoneNumber(@PathVariable double phoneNumber) {
        Patient patient = patientService.findByPhoneNumber(phoneNumber);
        return patient;
    }
    @GetMapping("/getByLastName/{lastName}/{dob}")
    public Patient findByLastNameAndDob(@PathVariable String lastName,@PathVariable Date dob) {
        Patient patient = patientService.findByLastNameAndDob(lastName,dob);
        return patient;
    }
}
