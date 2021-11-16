package com.entrepreware.task.enterprewaretask.dao;

import com.entrepreware.task.enterprewaretask.Entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface PhoneNumberRepository extends JpaRepository<PhoneNumber,Integer> {

}
