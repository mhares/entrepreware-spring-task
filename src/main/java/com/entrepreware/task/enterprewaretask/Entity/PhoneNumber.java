package com.entrepreware.task.enterprewaretask.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "phone_number")
@Getter @Setter
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="valid")
	private boolean valid;
	@Column(name="number")
	private String number;
	@Column(name="local_format")
	private String local_format;
	@Column(name="international_format")
	private String	international_format;
	@Column(name="country_prefix")
    private String	country_prefix;
	@Column(name="country_code")
	private String	country_code;
	@Column(name="country_name")
    private String	country_name;
	@Column(name="location")
    private String location;
	@Column(name="carrier")
    private String 	carrier;
	@Column(name="line_type")
	private String 	line_type;

}
