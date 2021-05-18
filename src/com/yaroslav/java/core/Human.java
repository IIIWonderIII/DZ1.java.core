package com.yaroslav.java.core;

public class Human implements JumpRun{
    int maxHeight;
    int maxLength;
    String name;

    public Human(int maxHeight, int maxLength, String name) {
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
        System.out.println("Human runing");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Human jumping");
    }

    @Override
    public String toString() {
        return "Спортсмен " + name;
    }
}