package com.example.wassim.dynamicgrid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppConstant {
    static List<Integer> imageArray;

    public static List<Integer> getImageArray(){

        imageArray = new ArrayList<>();
        imageArray.add(R.drawable.beet_png52);
        imageArray.add(R.drawable.broccoli_png72974);
        imageArray.add(R.drawable.pumpkin_1768857_640);
        imageArray.add(R.drawable.ic_launcher_background);





        Collections.shuffle(imageArray);

        return imageArray;
    }
}
