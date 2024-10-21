package org.example.basiceclasses;


public class Movie {
    private String name;
    private Integer likes;
    private Genre genre;

    public Movie(String name, Integer likes, Genre genre) {
        this.name = name;
        this.likes = likes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
