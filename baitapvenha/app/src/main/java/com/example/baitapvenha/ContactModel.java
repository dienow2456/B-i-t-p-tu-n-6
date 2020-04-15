package com.example.baitapvenha;

public class ContactModel {
    String fullname;
    String main;
    int avatarResource;
    boolean isSelected;
    boolean isLeft;
    String time;

    public ContactModel(String fullname, int avatarResource) {
        this.fullname = fullname;
        this.avatarResource = avatarResource;
        this.isSelected = false;
        this.isLeft = true;
        this.main=main;
        this.time=time;
    }

    public ContactModel(String fullname, int avatarResource, boolean isLeft,String main, String time) {
        this.fullname = fullname;
        this.avatarResource = avatarResource;
        this.isLeft = isLeft;
        this.main=main;
        this.time=time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public void setLeft(boolean left) {
        isLeft = left;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}

