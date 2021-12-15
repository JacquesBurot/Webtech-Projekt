package de.htwberlin.webtech.api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "persons")
public class Event {

    private long id;
    private String eventName;
    private boolean concert;
    private String djName;
    private boolean zweiG;

    public Event(long id, String eventName,  String djName, boolean zweiG, boolean concert) {
        this.id = id;
        this.eventName = eventName;
        this.djName = djName;
        this.zweiG = zweiG;
        this.concert = concert;
    }

    public Event() {

    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDjName() {
        return djName;
    }

    public void setDjName(String djName) {
        this.djName = djName;
    }

    public boolean isZweiG() {
        return zweiG;
    }

    public void setZweiG(boolean zweiG) {
        this.zweiG = zweiG;
    }

    public boolean isConcert() {
        return concert;
    }

    public void setConcert(boolean concert) {
        this.concert = concert;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
