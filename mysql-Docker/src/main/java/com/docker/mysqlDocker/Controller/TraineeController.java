package com.docker.mysqlDocker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.mysqlDocker.Dao.TraineeDao;
import com.docker.mysqlDocker.model.Trainee;

@RestController
@RequestMapping("/trainees")
public class TraineeController {
	@Autowired
	private TraineeDao repo;
	
	@GetMapping
	public List<Trainee> getAllTrainees()
	{
		return repo.findAll();
		
	}
	@PostMapping
	public Trainee addTrainee(@RequestBody Trainee trainee) {
		return repo.save(trainee);
	}

}
