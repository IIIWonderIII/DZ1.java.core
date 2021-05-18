package com.yaroslav.java.core;

public class Cat implements JumpRun {
    int maxHeight;
    int maxLength;
    String name;

    public Cat(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Cat jumping");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Cat runing");
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}