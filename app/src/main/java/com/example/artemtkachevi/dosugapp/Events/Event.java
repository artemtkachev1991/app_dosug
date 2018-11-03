package com.example.artemtkachevi.dosugapp.Events;

import java.sql.Timestamp;
import java.util.UUID;

public class Event {

    private UUID eventId;
    private Timestamp startTimeEvent;
    private Timestamp expiredTimeEvent;
    private String description;
    private String contact;
    private int likes;

    public Event() {
    }

    public Event(UUID eventId, Timestamp startTimeEvent, Timestamp expiredTimeEvent, String description, String contact, int likes) {
        this.eventId = eventId;
        this.startTimeEvent = startTimeEvent;
        this.expiredTimeEvent = expiredTimeEvent;
        this.description = description;
        this.contact = contact;
        this.likes = likes;
    }

    public UUID getEventId() {
        return eventId;
    }

    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public Timestamp getStartTimeEvent() {
        return startTimeEvent;
    }

    public void setStartTimeEvent(Timestamp startTimeEvent) {
        this.startTimeEvent = startTimeEvent;
    }

    public Timestamp getExpiredTimeEvent() {
        return expiredTimeEvent;
    }

    public void setExpiredTimeEvent(Timestamp expiredTimeEvent) {
        this.expiredTimeEvent = expiredTimeEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
