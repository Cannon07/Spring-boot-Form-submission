package com.jpmware.formsubmission;

import java.util.List;

public class FormData {
    private String id;
    private String name;
    private String dateAndTime;
    private String description;
    private String eventDuration;
    private String venueId;
    private List<Artist> artistList;
    private List<Tier> tierList;

    public FormData() {

    }

    public FormData(String id, String name, String dateAndTime, String description, String eventDuration,
            String venueId, List<Artist> artistList, List<Tier> tierList) {
        this.id = id;
        this.name = name;
        this.dateAndTime = dateAndTime;
        this.description = description;
        this.eventDuration = eventDuration;
        this.venueId = venueId;
        this.artistList = artistList;
        this.tierList = tierList;
    }

    public FormData(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public List<Tier> getTierList() {
        return tierList;
    }

    public void setTierList(List<Tier> tierList) {
        this.tierList = tierList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(String eventDuration) {
        this.eventDuration = eventDuration;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }
    
}
