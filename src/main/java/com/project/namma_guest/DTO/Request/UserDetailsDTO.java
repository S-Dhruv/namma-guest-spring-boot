package com.project.namma_guest.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDetailsDTO {
    private String family_name;
    private String given_name;

    private String email;
    private String contactNumber;
    private Point currentLocation;

}
