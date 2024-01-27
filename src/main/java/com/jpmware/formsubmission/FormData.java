package com.jpmware.formsubmission;

public class FormData {
    private Artist[] artistList;

    public FormData() {

    }

    public FormData(Artist[] artistList) {
        this.artistList = artistList;
    }

    public Artist[] getArtistList() {
        return artistList;
    }

    public void setArtistList(Artist[] artistList) {
        this.artistList = artistList;
    }

    
}
