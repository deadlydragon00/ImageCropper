package io.github.bitmapcropper.pojo;

/**
 * Created by deadlydragon00 on 6/17/2015.
 */
public class Rect {

    int x1;
    int x2;
    int y1;
    int y2;
    int weight;

    public Rect(int x1, int x2, int y1, int y2, int weight) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.weight = weight;
    }

    public Rect(String input) {
        String[] param = input.split(" ");
        if (param.length != 5)
            throw new IllegalArgumentException("String parameter must have 5 arguments!");

        this.x1 = Integer.parseInt(param[0]);
        this.x2 = Integer.parseInt(param[1]);
        this.y1 = Integer.parseInt(param[2]);
        this.y2 = Integer.parseInt(param[3]);
        this.weight = Integer.parseInt(param[4]);
    }
}
