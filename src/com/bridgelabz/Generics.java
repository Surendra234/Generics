package com.bridgelabz;

public class Generics {

    public static void main(String[] args) {

        FindMaximum findMaximum = new FindMaximum();

        String testCase1 = findMaximum.maxNum("Surendra","Gaurav","Rahul");
        System.out.println("Maximum value of String for Case-1 is : " +testCase1);

        String testCase2 = findMaximum.maxNum("Gaurav","Rahul","Pradeep");
        System.out.println("Maximum value of String for Case-2 is : " +testCase2);

        String testCase3 = findMaximum.maxNum("Lovesh","Prince","Twarit");
        System.out.println("maximum value of String for Case-3 is : " +testCase3);
    }
}