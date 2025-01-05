package com.project.namma_guest.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hostel {
    //Hostel Name
    private String name;

    //Hostel Address
    private String address;
    private String city;
    private String state;
    private String country;

    //Hostel Contact
    private String email;
    private String contactNumber;
    private String whatsappNumber;

    //Hostel Location
    private Point location;

    // Override toString method
    @Override
    public String toString() {
        return "Hostel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", whatsappNumber='" + whatsappNumber + '\'' +
                ", location=" + location +
                '}';
    }
}
