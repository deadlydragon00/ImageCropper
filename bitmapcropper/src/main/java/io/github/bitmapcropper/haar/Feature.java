package io.github.bitmapcropper.haar;

import java.util.ArrayList;

import io.github.bitmapcropper.pojo.Rect;

/**
 * Created by deadlydragon00 on 6/18/2015.
 */
public class Feature {

    private ArrayList<Rect> rectStorage = null;
    private float leftValue;
    private float rightValue;

    public Feature() {

    }

    public void addRect(Rect rect) {
        rectStorage.add(rect);
    }

}
