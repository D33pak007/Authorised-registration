package com.SunBaseData.Java.Project.Controller;

import com.SunBaseData.Java.Project.Model.User;
import com.SunBaseData.Java.Project.Service.Userservice;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private Userservice userService;

    @GetMapping("/users")


    public List <User> test() {

        return this.userService.getusers();
    }


}
