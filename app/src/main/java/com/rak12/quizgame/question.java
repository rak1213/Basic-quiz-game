package com.rak12.quizgame;

public class question {
    private int ari;
    private boolean at;

    public question(int ari, boolean at) {
        this.ari = ari;
        this.at = at;
    }

    public int getAri() {
        return ari;
    }

    public void setAri(int ari) {
        this.ari = ari;
    }

    public boolean isAt() {
        return at;
    }

    public void setAt(boolean at) {
        this.at = at;
    }
}
