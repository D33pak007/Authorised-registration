package com.SunBaseData.Java.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SunBaseData.Java.Project.Model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {


    

}
