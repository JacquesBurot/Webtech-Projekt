package de.htwberlin.webtech.api;

import java.text.SimpleDateFormat;

public class EventManipulationRequest {
    private String eventName;
    private String djName;
    private boolean zweiG;
    private boolean concert;
    private String stadt;
    private int postleitzahl;
    private String straße;
    private int hausnmr;
    private String uhrzeit;
    private SimpleDateFormat datum;
    private String promolink;

    public EventManipulationRequest(String eventName, String djName, boolean zweiG, boolean concert, String stadt, int postleitzahl, String straße, int hausnmr, String uhrzeit, SimpleDateFormat datum, String promolink) {
        this.eventName = eventName;
        this.djName = djName;
        this.zweiG = zweiG;
        this.concert = concert;
        this.stadt = stadt;
        this.postleitzahl = postleitzahl;
        this.straße = straße;
        this.hausnmr = hausnmr;
        this.uhrzeit = uhrzeit;
        this.datum = datum;
        this.promolink = promolink;
    }

    public EventManipulationRequest() {}

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public void setDjName(String djName) {
        this.djName = djName;
    }

    public void setZweiG(boolean zweiG) {
        this.zweiG = zweiG;
    }

    public void concert(boolean concert) {
        this.concert = concert;
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

    public boolean isConcert(){ return concert;}

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

    public SimpleDateFormat getDatum() {
        return datum;
    }

    public void setDatum(SimpleDateFormat datum) {
        this.datum = datum;
    }

    public String getPromolink() {
        return promolink;
    }

    public void setPromolink(String promolink) {
        this.promolink = promolink;
    }
}
