package com.SunBaseData.Java.Project.Service;

import com.SunBaseData.Java.Project.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class Userservice {

    private List<User> arr = new ArrayList<>();

    public  Userservice(){
        arr.add(new User(UUID.randomUUID().toString(),"Deepak","dkgupta250503@gmail.com"));
    }
    public List<User> getusers(){
        return arr;
    }

}
