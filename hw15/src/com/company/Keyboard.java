package com.company;

public class Keyboard {
    String[] lang = new String[3];
    boolean backlight;
    boolean addNum;

    public Keyboard(String[] lang, boolean backlight, boolean addNum) {
        this.lang = lang;
        this.backlight = backlight;
        this.addNum = addNum;
    }

    public String[] getLang() {
        return lang;
    }

    public void setLang (String[] lang) {
        this.lang = lang;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean isAddNum() {
        return addNum;
    }

    public void setAddNum(boolean addNum) {
        this.addNum = addNum;
    }
}
