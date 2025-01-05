package com.example.spotifycamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.HashMap;

public class ColorExtractor {
    public static Bitmap loadBitmap(String path){
        return BitmapFactory.decodeFile(path);
    }

    public static HashMap<Color,Integer> extractColorMap(Bitmap img){
        HashMap<Color,Integer> colorMap = new HashMap<>();

        for(int x = 0; x < img.getWidth();++x){
            for(int y = 0; y < img.getHeight();++y){
                int pixel = img.getPixel(x,y);
                if(colorMap.containsKey(new Color(pixel)))
                    colorMap.put(new Color(pixel),colorMap.get(pixel)+1);
                else colorMap.put(new Color(pixel),1);
            }
        }
        return colorMap;
    }

    public static HashMap<Integer,Integer> paletteOptimizing(HashMap<Integer,Integer> map, int acc){
        return null;
    }
}
