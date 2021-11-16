package com.entrepreware.task.enterprewaretask.controller;

import com.entrepreware.task.enterprewaretask.Entity.PhoneNumber;
import com.entrepreware.task.enterprewaretask.dao.PhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.Collections;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ResponseController {
	@Autowired
	private PhoneNumberRepository repo;
	private final String baseUrl ="http://apilayer.net/api/validate?access_key=3645490cb23aab6df4d0f0c3c5447e36&number=";
	RestTemplate restTemplate = new RestTemplate();

	@GetMapping("/phones/{number}")
	public ResponseEntity<PhoneNumber> getNumber(@PathVariable String number)  {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity request = new HttpEntity(headers);
		ResponseEntity<PhoneNumber> response = restTemplate.exchange(baseUrl+number+"&country_code=&format=1", HttpMethod.GET, request, PhoneNumber.class, 1
		);
		if (response.getStatusCode() == HttpStatus.OK) {
			System.out.println("Request Successful.");
			System.out.println(response.getBody());
			repo.save(response.getBody());
		} else {
			System.out.println("Request Failed");
			System.out.println(response.getStatusCode());
		}
		return response;
	}

}
