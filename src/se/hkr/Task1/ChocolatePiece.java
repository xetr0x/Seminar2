package se.hkr.Task1;

import java.lang.reflect.Array;

public class ChocolatePiece {
    String shape;
    int weight;
    boolean eaten = false;


    public String getShape() {
        return shape;
    }

    public int getWeight() {
        return weight;
    }

    public boolean getEaten() {
        return eaten;
    }

    public ChocolatePiece(String shape, int weight) {
        this.shape = shape;
        this.weight = weight;
    }

    public void setEaten(boolean eaten) {
        this.eaten = true;
    }
    public boolean IsEaten() {
        return eaten;
        }
    }



