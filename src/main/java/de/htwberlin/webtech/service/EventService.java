package de.htwberlin.webtech.service;

import de.htwberlin.webtech.api.Event;
import de.htwberlin.webtech.persistence.EventEntity;
import de.htwberlin.webtech.persistence.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> findAll(){
        List<EventEntity> events = eventRepository.findAll();
        return events.stream()
                .map(eventEntity -> new Event(
                        eventEntity.getId(),
                        eventEntity.getEventName(),
                        eventEntity.getDjName(),
                        eventEntity.isZweiG()
                ))
                .collect(Collectors.toList());
    }
}
