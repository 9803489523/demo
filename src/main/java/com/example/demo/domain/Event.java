package com.example.demo.domain;

import com.example.demo.domain.Keys.EventPK;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@IdClass(EventPK.class)
@Table(name = "events")
public class Event {
    @Id
    private int event_id;
    @Id
    private int training_id;
    @Id
    private int exercise_id;

    private LocalDateTime event_date;

    public Event() {
    }

    public Event(int event_id, int training_id, int exercise_id, LocalDateTime event_date) {
        this.event_id = event_id;
        this.training_id = training_id;
        this.exercise_id = exercise_id;
        this.event_date = event_date;
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

    public int getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(int exercise_id) {
        this.exercise_id = exercise_id;
    }

    public LocalDateTime getEvent_date() {
        return event_date;
    }

    public void setEvent_date(LocalDateTime event_date) {
        this.event_date = event_date;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s",event_id,training_id,exercise_id,event_date);
    }
}
