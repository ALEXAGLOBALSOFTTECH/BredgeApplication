package com.example.bredge.fallow;

public class FallowModel {
    String user_name;
    int user_images;
    String user_follower;

    public FallowModel(String user_name, int user_images, String user_follower) {
        this.user_name = user_name;
        this.user_images = user_images;
        this.user_follower = user_follower;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_images() {
        return user_images;
    }

    public void setUser_images(int user_images) {
        this.user_images = user_images;
    }

    public String getUser_follower() {
        return user_follower;
    }

    public void setUser_follower(String user_follower) {
        this.user_follower = user_follower;
    }
}
