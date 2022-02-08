package com.example.demo.domain.Keys;

import java.io.Serializable;
import java.util.Objects;

public class EventPK implements Serializable {
    private int event_id;

    private int training_id;

    private int exercise_id;

    public EventPK() {
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public int getTraining_id() {
        return training_id;
    }

    public void setTraining_id(int training_id) {
        this.training_id = training_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventPK eventPK = (EventPK) o;
        return event_id == eventPK.event_id && training_id == eventPK.training_id && exercise_id == eventPK.exercise_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(event_id, training_id, exercise_id);
    }

    public int getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(int exercise_id) {
        this.exercise_id = exercise_id;
    }
}

