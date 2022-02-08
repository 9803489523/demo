package com.example.demo.repos;

import com.example.demo.domain.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepo extends CrudRepository<Exercise,Integer> {
}
