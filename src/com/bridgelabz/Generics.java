package com.bridgelabz;

public class Generics {

    public static void main(String[] args) {

        // ----> Generics Integer Type <----
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        new FindMaximum<Integer>(intArray).maximum();

        // ----> Generics Float Type <----
        Float[] floatArray = {1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f,10.1f};
        new FindMaximum<Float>(floatArray).maximum();

        // ----> Generics String Type <----
        String[] stringArray = {"Gaurav","Rahul","Pradeep","Surendra","Prince","Twarit"};
        new FindMaximum<String>(stringArray).maximum();

    }
}