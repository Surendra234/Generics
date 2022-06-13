package com.bridgelabz;

public class Generics {

    public static void main(String[] args) {

        FindMaximum findMaximum = new FindMaximum();

        int testCase1 = findMaximum.maxNum(12,5,8);
        System.out.println("Maximum Number for Case-1 is : " +testCase1);

        int testCase2 = findMaximum.maxNum(25,30,10);
        System.out.println("Maximum Number for Case-2 is : " +testCase2);

        int testCase3 = findMaximum.maxNum(30,35,45);
        System.out.println("maximum Number for Case-3 is : " +testCase3);
    }
}