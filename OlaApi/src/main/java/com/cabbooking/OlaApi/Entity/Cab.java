package com.cabbooking.OlaApi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cab")

public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cabId;
    private String cabType;
    private String cabLicenseNum;
    private String cabName;
    private String cabNumber;
    private float perKmRate;
    private String currLocation;
    private String cabCurrStatus;

}
