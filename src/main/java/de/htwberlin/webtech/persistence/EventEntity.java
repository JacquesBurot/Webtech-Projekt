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
    private Boolean zweiG;

    @Column(name = "concert")
    private Boolean concert;

    public EventEntity(String eventName, String djName, Boolean zweiG, Boolean concert) {
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

    public Boolean isZweiG() {
        return zweiG;
    }

    public Boolean isConcert() {
        return concert;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setDjName(String djName) {
        this.djName = djName;
    }

    public void setZweiG(Boolean zweiG) {
        this.zweiG = zweiG;
    }

    public void setConcert(Boolean concert) {
        this.concert = concert;
    }




}
