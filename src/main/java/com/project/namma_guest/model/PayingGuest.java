package com.project.namma_guest.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.awt.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PayingGuest {
    @Id
    @SequenceGenerator(
            name="paying_sequence",
            sequenceName = "paying_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator ="paying_sequence"
    )
    private Long payingGuestId;
    private String name;

    //Address
    private String address;
    private String city;
    private String state;
    private String country;

    //Contact
    private String email;
    private String contactNumber;
    private String whatsappNumber;

    //Location
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    @Column(columnDefinition = "json")
    private Point location;
    private boolean isVerified;
    private String guestType;
}