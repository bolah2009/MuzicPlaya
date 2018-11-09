package com.bolaah.muzicplaya;

public class Song {

    private long id;
    private String title;
    private String artist;
    private String album;

    // constructor method in which we instantiate the instance variables
    public Song(long songID, String songTitle, String songArtist,String songAlbum ) {
        id=songID;
        title=songTitle;
        artist=songArtist;
        album=songAlbum;

    }

    //get methods for the instance variables
    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public String getAlbum(){return album;}


}
