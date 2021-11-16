package com.entrepreware.task.enterprewaretask.controller;

import com.entrepreware.task.enterprewaretask.Entity.PhoneNumber;
import com.entrepreware.task.enterprewaretask.dao.PhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PhoneNumberController {
	@Autowired
	private PhoneNumberRepository repo;
	@GetMapping("/all-phones")
	public List<PhoneNumber> getNumbers(){
	return	repo.findAll();
	}
}
