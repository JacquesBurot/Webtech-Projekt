package de.htwberlin.webtech.api;

public class Event {

    private long id;
    private String eventName;
    private String djName;
    private boolean zweiG;

    public Event(long id, String eventName, String djName, boolean zweiG) {
        this.id = id;
        this.eventName = eventName;
        this.djName = djName;
        this.zweiG = zweiG;
    }

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
}
