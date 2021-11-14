package de.htwberlin.webtech;

import de.htwberlin.webtech.api.Event;
import de.htwberlin.webtech.api.EventCreateRequest;
import de.htwberlin.webtech.persistence.EventRepository;
import de.htwberlin.webtech.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping(path = "/api/v1/events")
    public ResponseEntity<Void> createEvent(@RequestBody EventCreateRequest request) throws URISyntaxException {
        var event = eventService.create(request);
        URI uri = new URI("/api/v1/events/" + event.getId());
        return ResponseEntity.created(uri).build();
    }
}
