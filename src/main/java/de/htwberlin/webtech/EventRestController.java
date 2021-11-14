package de.htwberlin.webtech;

import de.htwberlin.webtech.api.Event;
import de.htwberlin.webtech.api.EventManipulationRequest;
import de.htwberlin.webtech.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class EventRestController {

    private final EventService eventService;

    public EventRestController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(path = "/api/v1/events")
    public ResponseEntity<List<Event>> fetchEvents() {
        return ResponseEntity.ok(eventService.findAll());
    }

    @GetMapping(path = "/api/v1/events/{id}")
    public ResponseEntity<Event> fetchEventById(@PathVariable Long id) {
        var event = eventService.findById(id);
        return event != null? ResponseEntity.ok(event): ResponseEntity.notFound().build();
    }

    @PostMapping(path = "/api/v1/events")
    public ResponseEntity<Void> createEvent(@RequestBody EventManipulationRequest request) throws URISyntaxException {
        var event = eventService.create(request);
        URI uri = new URI("/api/v1/events/" + event.getId());
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(path = "/api/v1/events/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody EventManipulationRequest request) {
        var event = eventService.update(id, request);
        return event != null? ResponseEntity.ok(event): ResponseEntity.notFound().build();
    }
}
