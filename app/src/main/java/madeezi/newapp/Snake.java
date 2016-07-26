package madeezi.newapp;

/**
 * Created by Tommy Le on 7/22/2016.
 */
public class Snake {
    private int length;
    private String color;

    public Snake() {
        length = 1;
        color = "color";
    }

    public Snake(int length) {
        this.length = length;
    }

    public Snake(String color) {
        this.color = color;
    }

    public Snake(int length, String color) {
        this.length = length;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
