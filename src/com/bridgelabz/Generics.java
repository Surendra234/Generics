package com.bridgelabz;

public class Generics {

    public static void main(String[] args) {

        FindMaximum findMaximum = new FindMaximum();

        float testCase1 = findMaximum.maxNum(12.2f,11.1f,10.0f);
        System.out.println("Maximum Number for Case-1 is : " +testCase1);

        float testCase2 = findMaximum.maxNum(15.5f,16.6f,14.4f);
        System.out.println("Maximum Number for Case-2 is : " +testCase2);

        float testCase3 = findMaximum.maxNum(23.3f,34.4f,56.6f);
        System.out.println("maximum Number for Case-3 is : " +testCase3);
    }
}