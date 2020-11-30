package com.company;

public class Farm {
    private String address;
    Cow[] cows;
    Sheep[] sheeps;
    Horse[] horses;
    String owner;

    public Farm () {}

    public Farm (String address, Cow[] cows, Sheep[] sheeps, Horse[] horses, String owner) {
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.owner = owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getAddress() {
        return address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}