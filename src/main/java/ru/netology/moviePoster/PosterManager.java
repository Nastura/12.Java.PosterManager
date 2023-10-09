package ru.netology.moviePoster;

public class PosterManager {
    private int id;
    private String title;
    private String genre;

    public PosterManager(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public PosterManager() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}