package com.example.spotifycamera;

public class ColorCount {
    int R;
    int G;
    int B;
    int count;

    public ColorCount(int red, int green, int blue){
        this.R = red;
        this.G = green;
        this.B = blue;
        count = 1;
    }

    public int[] getColor(){
        return new int[]{this.R, this.G, this.B};
    }

    public void incrementCount(){
        this.count++;
    }

    public int getCount(){
        return this.count;
    }
}
