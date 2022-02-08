package com.example.demo.repos;

import com.example.demo.domain.Event;
import com.example.demo.domain.Keys.EventPK;
import org.springframework.data.repository.CrudRepository;

public interface EventRepo extends CrudRepository<Event, EventPK> {
}
