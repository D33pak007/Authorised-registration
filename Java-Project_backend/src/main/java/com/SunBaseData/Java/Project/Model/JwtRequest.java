package com.SunBaseData.Java.Project.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private String login_id;
    private  String password;
}
