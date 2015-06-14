package io.github.bitmapcropper;

import android.graphics.Color;
import android.media.FaceDetector;

/**
 * Created by deadlydragon00 on 6/13/2015.
 */
public class Cropper {

    public static void getImage() {

        FaceDetector.Face[] a = new FaceDetector.Face[10];

        FaceDetector face = new FaceDetector(500, 500, 10);

    }

    /**
     * Change a certain pixel to a new color
     *
     * @param pixel the image pixel array
     * @param from the target pixel color
     * @param to the substitute color
     */
    public static void changePixelColor(int[] pixel,int from, int to){
        int pixelSize = pixel.length;
        for(int x = 0 ; x < pixelSize ;x++){
             if(pixel[x] == from){
                pixel[x] = to;
             }
        }
    }

}
