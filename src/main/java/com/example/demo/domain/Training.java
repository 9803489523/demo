package com.example.demo.domain;

import com.example.demo.domain.Keys.TrainingPK;

import javax.persistence.*;

@Entity
@IdClass(TrainingPK.class)
@Table(name = "trainings")
public class Training {
    @Id
    private int training_id;

    @Id
    private int exercise_id;

    private int exercise_number;

    public int getTraining_id() {
        return training_id;
    }

    public void setTraining_id(int training_id) {
        this.training_id = training_id;
    }

    public int getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(int exercise_id) {
        this.exercise_id = exercise_id;
    }

    public int getExercise_number() {
        return exercise_number;
    }

    public void setExercise_number(int exercise_number) {
        this.exercise_number = exercise_number;
    }

    public Training() {
    }

    public Training(int training_id, int exercise_id, int exercise_number) {
        this.training_id = training_id;
        this.exercise_id = exercise_id;
        this.exercise_number = exercise_number;
    }

    @Override
    public String toString() {
        return String.format("%s %s %S",training_id,exercise_id,exercise_number);
    }
}
