package com.example.demo;


import com.example.demo.domain.Event;
import com.example.demo.domain.Exercise;
import com.example.demo.domain.Training;
import com.example.demo.repos.EventRepo;
import com.example.demo.repos.ExerciseRepo;
import com.example.demo.repos.TrainingRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
public class DemoApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class);
		ExerciseRepo exerciseRepo = context.getBean(ExerciseRepo.class);
		TrainingRepo trainingRepo =context.getBean(TrainingRepo.class);
		EventRepo eventRepo =context.getBean(EventRepo.class);
		Iterable<Event> iterable3=eventRepo.findAll();
		Iterable<Training> iterable2=trainingRepo.findAll();
		Iterable<Exercise> iterable1=exerciseRepo.findAll();
		System.out.println(iterable1);
		System.out.println(iterable2);
		System.out.println(iterable3);
	}

}
