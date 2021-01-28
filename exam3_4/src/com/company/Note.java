package com.company;

public class Note extends PaperThings{
    boolean wrote;
    String whatWritten;

    public Note(boolean wrote, String whateWritten) {
        this.wrote = wrote;
        this.whatWritten = whateWritten;
    }

    public boolean isWrote() {
        return wrote;
    }

    public String getWhatWritten() {
        return whatWritten;
    }
}
