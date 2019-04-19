package com.example.user.arsnetwork.Models;

import java.util.Objects;

public class User {
    private long id;
    private String imageUrl;
    private String name;
    private String nick;
    private String description;
    private String location;
    private int followingCount;
    private int followersCount;

    public User(){

    }

    public User(long id, String imageUrl, String name, String nick, String description, String location, int followingCount, int followersCount) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.nick = nick;
        this.description = description;
        this.location = location;
        this.followingCount = followingCount;
        this.followersCount = followersCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                followingCount == user.followingCount &&
                followersCount == user.followersCount &&
                Objects.equals(imageUrl, user.imageUrl) &&
                Objects.equals(name, user.name) &&
                Objects.equals(nick, user.nick) &&
                Objects.equals(description, user.description) &&
                Objects.equals(location, user.location);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, nick);
    }

    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }
}
