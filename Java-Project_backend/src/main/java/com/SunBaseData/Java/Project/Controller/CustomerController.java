package com.SunBaseData.Java.Project.Controller;

import java.util.List;


import com.SunBaseData.Java.Project.Exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.SunBaseData.Java.Project.Service.CustomerService;
import com.SunBaseData.Java.Project.payloads.CustomerDto;

import javax.validation.Valid;

@RestController
@RequestMapping("/sunbase/portal/api/assignment.jsp")
public class CustomerController {

	@Autowired
	private CustomerService customerService;


	// create
	@PostMapping("/create")
	public ResponseEntity<String> createCategory(@Valid @RequestBody CustomerDto customerDto, @RequestParam("cmd") String st ) {
		if (!st.equals("create")) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Command");
		}
		this.customerService.createCategory(customerDto);
		return new ResponseEntity<>("Created Successfully", HttpStatus.CREATED);
	}

	// update

	@PostMapping("/update")
	public ResponseEntity<String> updateCategory(@Valid @RequestBody CustomerDto customerDto, @RequestParam("cmd") String st,@RequestParam("uuid") Integer cusId) {
		if (!st.equals("update")) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Command");
		}
		this.customerService.updateCategory(customerDto, cusId);
		return new ResponseEntity<>("", HttpStatus.OK);
	}

	// delete

	@PostMapping("/delete")
	public ResponseEntity<String> deleteCategory(@RequestParam("cmd") String st,@RequestParam("uuid") Integer cusId) {
		if (!st.equals("delete")) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Command");
		}
		this.customerService.deleteCategory(cusId);
		return new ResponseEntity<>("Customer is deleted successfully !!",
				HttpStatus.OK);
	}

	// get all
	@GetMapping("/get_customer_list")
	public ResponseEntity<List<CustomerDto>> getCategories(@RequestParam("cmd") String st) {
		if (!st.equals("get_customer_list")) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		List<CustomerDto> customers = this.customerService.getCategories();
		return ResponseEntity.ok(customers);
	}

}
