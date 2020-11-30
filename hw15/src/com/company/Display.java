package com.company;

public class Display {
    double diagonal;
    String madeBy;
    String panel;

    public Display(double diagonal, String madeBy, String panel) {
        this.diagonal = diagonal;
        this.madeBy = madeBy;
        this.panel = panel;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public String getPanel() {
        return panel;
    }

    public void setPanel(String panel) {
        this.panel = panel;
    }
}
