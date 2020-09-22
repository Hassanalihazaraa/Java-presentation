package com.Demo;

public class ClassDemo {
    private int number;
    private String text;

    public ClassDemo(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return this.number;
    }

    public int setNumber(int number) {
        return this.number = number;
    }

    public String getText() {
        return this.text;
    }

    public String setText(String text) {
        return this.text = text;
    }
}