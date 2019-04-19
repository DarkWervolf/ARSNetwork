package com.example.user.arsnetwork.Models;

public class Post {
    String link;
    String title;
    String text;
    String authors;
    int likes_counter;

    public Post(){

    }

    public Post(String link, String title, String text, String authors, int likes_counter) {
        this.link = link;
        this.title = title;
        this.text = text;
        this.authors = authors;
        this.likes_counter = likes_counter;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getAuthors() {
        return authors;
    }

    public int getLikes_counter() {
        return likes_counter;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public void setLikes_counter(int likes_counter) {
        this.likes_counter = likes_counter;
    }

    @Override
    public String toString() {
        return "Post{" +
                "link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", authors='" + authors + '\'' +
                ", likes_counter=" + likes_counter +
                '}';
    }
}
