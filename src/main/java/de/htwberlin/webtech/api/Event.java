package de.htwberlin.webtech.api;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Event {

    private long id;
    private String eventName;
    private boolean concert;
    private String djName;
    private boolean zweiG;
    private String stadt;
    private int postleitzahl;
    private String straße;
    private int hausnmr;
    private String uhrzeit;



    public Event(long id, String eventName, String djName, boolean zweiG, boolean concert, String stadt, int postleitzahl, String straße, int hausnmr, String uhrzeit) {
        this.id = id;
        this.eventName = eventName;
        this.djName = djName;
        this.zweiG = zweiG;
        this.concert = concert;
        this.stadt = stadt;
        this.postleitzahl = postleitzahl;
        this.straße = straße;
        this.hausnmr = hausnmr;
        this.uhrzeit = uhrzeit;
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

    public String getStadt() {
        return stadt;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public String getStraße() {
        return straße;
    }

    public int getHausnmr() {
        return hausnmr;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public void setHausnmr(int hausnmr) {
        this.hausnmr = hausnmr;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }
}
