package de.htwberlin.webtech.persistence;

import javax.persistence.*;

@Entity(name = "events")
public class EventEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "dj_name", nullable = false)
    private String djName;

    @Column(name = "zwei_g")
    private boolean zweiG;

    @Column(name = "concert")
    private boolean concert;

    public EventEntity(String eventName, String djName, boolean zweiG) {
        this.eventName = eventName;
        this.djName = djName;
        this.zweiG = zweiG;
        this.concert = concert;
    }

    protected EventEntity() {
    }

    public long getId() {
        return id;
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

    public boolean isConcert() {
        return concert;
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

    public void setConcert(boolean concert) {
        this.concert = concert;
    }




}
