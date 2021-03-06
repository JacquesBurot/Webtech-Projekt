package de.htwberlin.webtech.service;

import de.htwberlin.webtech.api.Event;
import de.htwberlin.webtech.api.EventManipulationRequest;
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

    public Event create(EventManipulationRequest request) {
        var eventEntity = new EventEntity(request.getEventName(), request.getDjName(), request.isZweiG(), request.isConcert(), request.getStadt(), request.getPostleitzahl(), request.getStraße(), request.getHausnmr(), request.getUhrzeit(), request.getDatum(), request.getPromolink());
        eventEntity = eventRepository.save(eventEntity);
        return transformEntity(eventEntity);
    }

    public Event update(Long id, EventManipulationRequest request) {
        var eventEntityOptional = eventRepository.findById(id);
        if(eventEntityOptional.isEmpty()) {
            return null;
        }

        var eventEntity = eventEntityOptional.get();
        eventEntity.setEventName(request.getEventName());
        eventEntity.setDjName(request.getDjName());
        eventEntity.setZweiG(request.isZweiG());
        eventEntity.setConcert(request.isConcert());
        eventEntity.setStadt(request.getStadt());
        eventEntity.setPostleitzahl(request.getPostleitzahl());
        eventEntity.setStraße(request.getStraße());
        eventEntity.setHausnmr(request.getHausnmr());
        eventEntity.setUhrzeit(request.getUhrzeit());
        eventEntity.setDatum(request.getDatum());
        eventEntity.setPromolink(request.getPromolink());
        eventEntity = eventRepository.save(eventEntity);

        return transformEntity(eventEntity);
    }

    public boolean deleteById(Long id) {
        if(!eventRepository.existsById(id)){
            return false;
        }

        eventRepository.deleteById(id);
        return true;

    }

    private Event transformEntity(EventEntity eventEntity) {
        return new Event(
                eventEntity.getId(),
                eventEntity.getEventName(),
                eventEntity.getDjName(),
                eventEntity.isZweiG(),
                eventEntity.isConcert(),
                eventEntity.getStadt(),
                eventEntity.getPostleitzahl(),
                eventEntity.getStraße(),
                eventEntity.getHausnmr(),
                eventEntity.getUhrzeit(),
                eventEntity.getDatum(),
                eventEntity.getPromolink()

        );
    }
}
