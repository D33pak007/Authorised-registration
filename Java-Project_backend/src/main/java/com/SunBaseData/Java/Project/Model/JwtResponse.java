package com.SunBaseData.Java.Project.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {

    private String jwttoken;
    private String username;
}
