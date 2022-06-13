package com.bridgelabz;

public class FindMaximum{

    public Float maxNum(Float x, Float y, Float z) {

        Float max = x;

        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}
