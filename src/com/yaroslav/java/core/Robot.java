package com.yaroslav.java.core;

public class Robot implements JumpRun {
    int maxHeight;
    int maxLength;
    String name;

    public Robot(int maxHeight, int maxLength, String name) {
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
        System.out.println("Robot jumping");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Robot runing");
    }
    @Override
    public String toString() {
        return "Робот " + name;
    }

}
