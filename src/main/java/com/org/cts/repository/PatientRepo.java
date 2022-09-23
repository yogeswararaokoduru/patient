package com.org.cts.repository;

import com.org.cts.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {
public Patient findByPatientId(long id);
public Patient findByPhoneNumber(double phoneNumber);
public Patient findByLastNameAndDateOfBirth(String lastName, Date dob);

}
