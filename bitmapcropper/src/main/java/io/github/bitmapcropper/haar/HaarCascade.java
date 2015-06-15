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
     * @param image   the portion of the image
     * @param cascade the cascade template
     * @return true if it has a cascade feature
     */
    public static boolean cascadePass(int[] image, byte[][] cascade) {

        return false;
    }


}
