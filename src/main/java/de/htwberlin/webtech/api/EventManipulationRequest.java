package de.htwberlin.webtech.api;

public class EventManipulationRequest {
    private String eventName;
    private String djName;
    private boolean zweiG;

    public EventManipulationRequest(String eventName, String djName, boolean zweiG) {
        this.eventName = eventName;
        this.djName = djName;
        this.zweiG = zweiG;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setDjName(String djName) {
        this.djName = djName;
    }

    public void setZweiG(boolean zweiG) {
        this.zweiG = zweiG;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDjName() {
        return djName;
    }

    public boolean isZweiG() {
        return zweiG;
    }
}