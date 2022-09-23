package com.org.cts.model;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientId;
    private  String firstName;
    private  String lastName;
    private  String addressLine1;
    private  String addressLine2;
    private  String city;
    private  String state;
    private  int zipCode;
    private  double phoneNumber;
    private Date dateOfBirth;

}
