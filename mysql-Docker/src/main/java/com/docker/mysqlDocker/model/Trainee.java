package com.docker.mysqlDocker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Trainee {
	
	@Id @GeneratedValue
	private long id;
	private String name;
	private String email;
	private LocalDate dob;

}
