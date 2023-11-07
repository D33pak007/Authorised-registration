package com.SunBaseData.Java.Project.Service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.SunBaseData.Java.Project.Exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SunBaseData.Java.Project.Model.Customer;

import com.SunBaseData.Java.Project.payloads.CustomerDto;
import com.SunBaseData.Java.Project.repositories.CustomerRepo;
import com.SunBaseData.Java.Project.Service.CustomerService;

@Service
public class CustomerServisImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public void createCategory(CustomerDto customerDto) {
		Customer cus = this.modelMapper.map(customerDto, Customer.class);
		this.customerRepo.save(cus);

	}

	@Override
	public void updateCategory(CustomerDto customerDto, Integer customerId) {

		Customer customerbyid = this.customerRepo.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", " Id ", customerId));
		Customer updatecustomer = this.modelMapper.map(customerDto, Customer.class);
		customerbyid.setFirst_name(updatecustomer.getFirst_name());
		customerbyid.setLast_name(updatecustomer.getLast_name());
		customerbyid.setState(updatecustomer.getState());
		customerbyid.setCity(updatecustomer.getCity());
		customerbyid.setEmail(updatecustomer.getEmail());
		customerbyid.setPhone(updatecustomer.getPhone());
		customerbyid.setStreet(updatecustomer.getStreet());
		customerbyid.setAddress(updatecustomer.getAddress());

	}

	@Override
	public void deleteCategory(Integer customerId) {

		Customer customerbyid = this.customerRepo.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", " Id ", customerId));

		customerRepo.delete(customerbyid);

	}

	@Override
	public List<CustomerDto> getCategories() {
		List<Customer> customers = this.customerRepo.findAll();
		List<CustomerDto> customerdtos = customers.stream()
				.map(customer -> this.modelMapper.map(customer, CustomerDto.class)).collect(Collectors.toList());
		return customerdtos;
	}

}
