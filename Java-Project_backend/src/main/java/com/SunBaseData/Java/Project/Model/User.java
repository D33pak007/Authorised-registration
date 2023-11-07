package com.SunBaseData.Java.Project.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class User {

    private String userid;
    private String login_id;
    private  String password;
}
