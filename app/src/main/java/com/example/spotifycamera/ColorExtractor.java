package com.example.spotifycamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.example.spotifycamera.ColorCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ColorExtractor {
    public static Bitmap loadBitmap(String path){
        return BitmapFactory.decodeFile(path);
    }

    public static List<ColorCount> extractColors(Bitmap img){
        ArrayList<ColorCount> ColorList = new ArrayList<ColorCount>();


        for(int x = 0; x < img.getWidth();++x){
            for(int y = 0; y < img.getHeight();++y){
                int pixel = img.getPixel(x,y);

            }
        }

        return ColorList;
    }
}
