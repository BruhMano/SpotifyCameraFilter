package com.example.spotifycamera;

import static java.lang.Math.abs;

public class Color {
    int R;
    int G;
    int B;

    public Color(int red, int green, int blue){
        this.R = red;
        this.G = green;
        this.B = blue;
    }

    public Color(int pixel){ // bitmap pixel int type to Color-class
        this.R = (pixel & 0xff0000) >> 16;
        this.G = (pixel & 0xff00) >> 8;
        this.B = pixel & 0xff;
    }

    public int[] getColor() {
        return new int[]{this.R, this.G, this.B};
    }

    public boolean colorEq(Color other, int acc) { // c0mpare tw0 c0l0rs with current accuracy
        return (abs(this.R - other.R) < acc && abs(this.G - other.G) < acc && abs(this.B - other.B) < acc);
    }
}
