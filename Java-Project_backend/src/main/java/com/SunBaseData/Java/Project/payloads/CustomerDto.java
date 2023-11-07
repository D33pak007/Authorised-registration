package com.SunBaseData.Java.Project.payloads;


import javax.validation.constraints.NotEmpty;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CustomerDto {

	@NotEmpty(message = "First Name can't be empty")
	private String first_name;
	@NotEmpty(message = "Last Name can't be empty")
	private String last_name;

	private String street;

	private String address;

	private String city;

	private String state;

	private String email;

	private String phone;

}
