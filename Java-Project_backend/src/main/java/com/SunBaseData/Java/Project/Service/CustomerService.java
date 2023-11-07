package com.SunBaseData.Java.Project.Service;

import java.util.List;

import com.SunBaseData.Java.Project.payloads.CustomerDto;

public interface CustomerService {

	// create
	void createCategory(CustomerDto customerDto);

	// update
	void updateCategory(CustomerDto customerDto, Integer cutomerId);

	// delete
	void deleteCategory(Integer cusdtomerId);

	// get All

	List<CustomerDto> getCategories();

}
