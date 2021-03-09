package models;

public class Album {

    private int id;
    private String artist;
    private String name;
    private int release_date;
    private Float sales;
    private String genre;

    public Album() {};  //javabean

    public Album(int id, String artist, String name, int release_date, Float sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return this.artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_date() {
        return this.release_date;
    }
    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public Float getSales() {
        return this.sales;
    }
    public void setSales(Float sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return this.genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

}
