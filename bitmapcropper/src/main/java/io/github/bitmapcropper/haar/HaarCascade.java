package io.github.bitmapcropper.haar;

/**
 * Created by deadlydragon00 on 6/15/2015.
 */
public class HaarCascade {

    public static final byte[][] TYPE_A = new byte[][]{
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 0},
    };


    /**
     * Analyze the given portion of image whether is pass the cascade
     *
     * @param image       the portion of the image
     * @param cascade     the cascade template
     * @param imageWidth  the image width
     * @param imageHeight the image height
     * @return true if it has a cascade feature
     */
    public static boolean cascadePass(int[] image, byte[][] cascade, int imageWidth, int imageHeight) {
        if (imageWidth < cascade[0].length || imageHeight < cascade.length)
            throw new IllegalArgumentException("Cascade must not be bigger than image portion");

        int sum = 0;
        for (int x = 0; x < imageHeight; x++) {
            for (int y = 0; y < imageHeight; y++) {
                if (image[x * y] == cascade[x][y]) {
                    sum++;
                }
            }
        }

        // count the image pixel and get the 3/4 value at compare to the sum
        return image.length * 3 / 4 >= sum ? true : false;
    }


}
