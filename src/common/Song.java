package common;

import java.sql.Time;
import java.util.Objects;

public class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private String composer;
    private Time songLength;
    
    public Song(String title, String artist, String composer, String songLength){
        setTitle(title);
        setArtist(artist);
        setComposer(composer);
        setSongLength(songLength);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.title);
        hash = 89 * hash + Objects.hashCode(this.artist);
        hash = 89 * hash + Objects.hashCode(this.composer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.composer, other.composer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + ", composer=" + composer + ", songLength=" + songLength + '}';
    }
    
    public final String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public final String getArtist() {
        return artist;
    }

    private void setArtist(String artist) {
        this.artist = artist;
    }

    public final String getComposer() {
        return composer;
    }

    private void setComposer(String composer) {
        this.composer = composer;
    }

    public final Time getSongLength() {
        return songLength;
    }

    private void setSongLength(String songLength) {
        this.songLength = Time.valueOf(songLength);
    }

    @Override
    public final int compareTo(Song o) {
        return this.artist.compareTo(o.getArtist());
    }
}
