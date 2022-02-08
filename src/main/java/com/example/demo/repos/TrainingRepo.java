package com.example.demo.repos;

import com.example.demo.domain.Keys.TrainingPK;
import com.example.demo.domain.Training;
import org.springframework.data.repository.CrudRepository;

public interface TrainingRepo extends CrudRepository<Training, TrainingPK> {
}
