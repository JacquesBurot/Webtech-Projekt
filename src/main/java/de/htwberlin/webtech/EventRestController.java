package de.htwberlin.webtech;

import de.htwberlin.webtech.api.Event;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EventRestController {

    private List<Event> events;

    public EventRestController(){
        events = new ArrayList<>();
        events.add(new Event(1,"FactoryNight", "DjGigola", false));
        events.add(new Event(2,"FactoryNight2", "Solomun", false));
    }


    @GetMapping(path = "/api/v1/events")
    public ResponseEntity<List<Event>> fetchEvents() {
      return ResponseEntity.ok(events);
    }

}
