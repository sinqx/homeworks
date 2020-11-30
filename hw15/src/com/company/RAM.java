package com.company;

public class RAM {
    int memory;
    String madeBy;

    public RAM(int memory, String madeBy) {
        this.memory = memory;
        this.madeBy = madeBy;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}