package io.github.bitmapcropper.haar;

/**
 * Created by deadlydragon00 on 6/19/2015.
 */
public class Stage {

    private int threshold;

    public Stage(int threshold) {
        this.threshold = threshold;
    }

    public boolean isPassed(int[][] integralImage, int[][] testSpace) {

        if (testSpace[0].length <= 24 && testSpace.length <= 24)
            throw new IllegalArgumentException("Near 24x24 testing does not make sense to trace!");
        //loop here
        int sum = 0;
        return sum > threshold;
    }


}
