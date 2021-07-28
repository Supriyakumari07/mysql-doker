package com.docker.mysqlDocker.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.mysqlDocker.model.Trainee;

public interface TraineeDao extends JpaRepository<Trainee,Long> {

}
