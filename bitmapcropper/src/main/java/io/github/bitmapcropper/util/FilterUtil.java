package io.github.bitmapcropper.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

/**
 * Created by deadlydragon00 on 6/13/2015.
 */
public class FilterUtil {

    /**
     * Convert colored image to grayscale
     *
     * @param bitmap the bitmap to be converted
     * @return grayscale image
     */
    public static Bitmap toGrayscale(Bitmap bitmap) {
        if (bitmap == null)
            throw new IllegalArgumentException("Bitmap must not be equal to null!");

        int imageWidth = bitmap.getWidth();
        int imageHeight = bitmap.getHeight();

        Bitmap newBitmap = Bitmap.createBitmap(imageWidth, imageHeight, Bitmap.Config.ARGB_8888);
        Canvas drawingCanvas = new Canvas(newBitmap);
        Paint paint = new Paint();
        ColorMatrix m = new ColorMatrix();
        m.setSaturation(0);
        ColorMatrixColorFilter grayscaleFilter = new ColorMatrixColorFilter(m);
        paint.setColorFilter(grayscaleFilter);
        drawingCanvas.drawBitmap(bitmap, 0, 0, paint);
        return newBitmap;
    }

}
