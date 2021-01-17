package com.company;

public abstract class AbstractLocality {
    private String name;
    private String leader;

    public AbstractLocality(){}

    public AbstractLocality(String name, String leader) {
        this.name = name;
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public String getLeader() {
        return leader;
    }
}
