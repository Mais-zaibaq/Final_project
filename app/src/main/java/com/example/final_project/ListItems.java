package com.example.final_project;

public class ListItems {

    String name;
    String prise;
    int image;

    public ListItems(String name, String prise, int image) {
        this.name = name;
        this.prise = prise;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(String name) {
        this.prise = name;
    }

    public void setImage(int name) {
        this.image = name;
    }

    public String getName() {
        return name;
    }

    public String getPrise() {
        return prise;
    }

    public int getImage() {
        return image;
    }
}
