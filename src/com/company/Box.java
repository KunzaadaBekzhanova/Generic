package com.company;

public class Box <T>{
    private static Object Box;
    private int width;
    private  int length;

    public Box(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    static <T> T returnBox() {
        Box i = new Box(25,35);
        return (T)i;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
