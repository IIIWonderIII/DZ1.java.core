package com.yaroslav.java.core;

public class Treadmill implements Let {
    int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "Длину беговой дорожки: " + length + " м";
    }
}
