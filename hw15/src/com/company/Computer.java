package com.company;

public class Computer {
    Display displayType;
    String madeBy;
    String color;
    RAM ramType;
    String graphicCard;
    USB ubsType;
    Keyboard keyboardType;

    public Computer(Display displayType, String madeBy, String color, RAM ramType, String graphicCard, USB ubsType, Keyboard keyboardType) {
        this.displayType = displayType;
        this.madeBy = madeBy;
        this.color = color;
        this.ramType = ramType;
        this.graphicCard = graphicCard;
        this.ubsType = ubsType;
        this.keyboardType = keyboardType;
    }


    public Display getDisplayType() {
        return displayType;
    }

    public void setDisplayType(Display displayType) {
        this.displayType = displayType;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public RAM getRamType() {
        return ramType;
    }

    public void setRamType(RAM ramType) {
        this.ramType = ramType;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public USB getUbsType() {
        return ubsType;
    }

    public void setUbsType(USB ubsType) {
        this.ubsType = ubsType;
    }

    public Keyboard getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(Keyboard keyboardType) {
        this.keyboardType = keyboardType;
    }
}
