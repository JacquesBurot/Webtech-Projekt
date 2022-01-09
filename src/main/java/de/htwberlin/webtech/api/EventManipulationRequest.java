package de.htwberlin.webtech.api;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.text.SimpleDateFormat;

public class EventManipulationRequest {

    @NotBlank(message = "The Event name must not be empty!")
    private String eventName;

    @NotBlank(message = "The DJ name must not be empty!")
    private String djName;

    @NotBlank(message = "The Stadt must not be empty!")
    private String stadt;

    @NotBlank(message = "The Straße must not be empty!")
    private String straße;

    @Min(1)
    @NotBlank(message = "The Hausnummer must not be 0!")
    private int hausnmr;

    @NotBlank(message = "The Uhrzeit must not be empty!")
    private String uhrzeit;

    @NotBlank(message = "The Datum must not be empty!")
    private String datum;


    private boolean zweiG;
    private boolean concert;
    private int postleitzahl;
    private String promolink;

    public EventManipulationRequest(String eventName, String djName, boolean zweiG, boolean concert, String stadt, int postleitzahl, String straße, int hausnmr, String uhrzeit, String datum, String promolink) {
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

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getPromolink() {
        return promolink;
    }

    public void setPromolink(String promolink) {
        this.promolink = promolink;
    }
}
