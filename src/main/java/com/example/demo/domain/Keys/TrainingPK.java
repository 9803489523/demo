package com.example.demo.domain.Keys;


import java.io.Serializable;
import java.util.Objects;

public class TrainingPK implements Serializable {

    private int training_id;

    private int exercise_id;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainingPK that = (TrainingPK) o;
        return training_id == that.training_id && exercise_id == that.exercise_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(training_id, exercise_id);
    }
}
