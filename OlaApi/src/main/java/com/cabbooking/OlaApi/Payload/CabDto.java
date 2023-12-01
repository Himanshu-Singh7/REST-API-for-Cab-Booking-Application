package com.cabbooking.OlaApi.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CabDto {

    private long cabId;
    private String cabType;
    private String cabLicenseNum;
    private String cabName;
    private String cabNumber;
    private float perKmRate;
    private String currLocation;
    private String cabCurrStatus;
}
