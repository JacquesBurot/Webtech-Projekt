package de.htwberlin.webtech.service;

import de.htwberlin.webtech.api.Event;
import de.htwberlin.webtech.api.EventCreateRequest;
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

    public List<Event> findAll() {
        List<EventEntity> events = eventRepository.findAll();
        return events.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }

    public Event findById(Long id) {
        var eventEntity = eventRepository.findById(id);
        return eventEntity.isPresent()? transformEntity((eventEntity.get())): null;
    }

    public Event create(EventCreateRequest request) {
        var eventEntity = new EventEntity(request.getEventName(), request.getDjName(), request.isZweiG());
        eventEntity = eventRepository.save(eventEntity);
        return transformEntity(eventEntity);
    }

    private Event transformEntity(EventEntity eventEntity) {
        return new Event(
                eventEntity.getId(),
                eventEntity.getEventName(),
                eventEntity.getDjName(),
                eventEntity.isZweiG()
        );
    }
}
