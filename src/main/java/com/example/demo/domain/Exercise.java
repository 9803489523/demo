package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exercises")
public class Exercise {
    @Id
    private int exercise_id;

    @Column(nullable = false)
    private String exercise_name;

    @Column(nullable = false)
    private String description;

    public Exercise() {
    }

    public Exercise(int exercise_id, String exercise_name, String description) {
        this.exercise_id = exercise_id;
        this.exercise_name = exercise_name;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Название упражнения:\n%s\nОписание:\n%s\n",exercise_name,description);
    }

    public int getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(int exercise_id) {
        this.exercise_id = exercise_id;
    }

    public String getExercise_name() {
        return exercise_name;
    }

    public void setExercise_name(String exercise_name) {
        this.exercise_name = exercise_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
