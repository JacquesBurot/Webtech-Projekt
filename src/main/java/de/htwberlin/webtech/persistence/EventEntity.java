package de.htwberlin.webtech.persistence;

import javax.persistence.*;
import java.text.SimpleDateFormat;

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

    @Column(name = "stadt")
    private String stadt;

    @Column(name = "postleitzahl")
    private int postleitzahl;

    @Column(name = "straße")
    private String straße;

    @Column(name = "hausnmr")
    private int hausnmr;

    @Column(name = "uhrzeit")
    private String uhrzeit;

    @Column(name = "datum")
    private String datum;

    @Column(name = "promolink")
    private String promolink;


    public EventEntity(String eventName, String djName, Boolean zweiG, Boolean concert, String stadt, int postleitzahl, String straße, int hausnmr, String uhrzeit, String datum, String promolink) {
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

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public int getHausnmr() {
        return hausnmr;
    }

    public void setHausnmr(int hausnmr) {
        this.hausnmr = hausnmr;
    }

    public String getUhrzeit() {
        return uhrzeit;
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
