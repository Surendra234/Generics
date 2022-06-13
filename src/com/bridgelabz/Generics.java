package com.bridgelabz;

public class Generics {

    public static void main(String[] args) {

        // ----> Generics Integer Type <----
        // Test case-1. Maximum value at position-1
        System.out.println("Maximum value for Case-1 is : " +FindMaximum.maximum(120,110,100));

        // Test case-2. Maximum value at position-2
        System.out.println("Maximum value for Case-2 is : " +FindMaximum.maximum(110,130,100));

        // Test case-3. Maximum value at position-3
        System.out.println("Maximum value for Case-3 is : " +FindMaximum.maximum(100,110,140));
        System.out.println("=========================================================================");

        // ----> Generics Float Type <----
        // Test case-1. Maximum value at position-1
        System.out.println("Maximum value for Case-1 is : " +FindMaximum.maximum(13.3f,12.2f,11.1f));

        // Test case-2. Maximum value at position-2
        System.out.println("Maximum value for Case-2 is " +FindMaximum.maximum(23.3f,45.5f,34.4f));

        // Test case-3. Maximum value at position-3
        System.out.println("Maximum value for Case-3 is : " +FindMaximum.maximum(46.6f,78.8f,98.9f));
        System.out.println("=========================================================================");

        // ----> Generics String Type <----
        // Test case-1. Maximum value at position-1
        System.out.println("Maximum value for Case-1 is : " +FindMaximum.maximum("Surendra","Gaurav","Rahul"));

        // Test case-2. Maximum value at position-2
        System.out.println("Maximum value for Case-2 is : " +FindMaximum.maximum("Gaurav","Rahul","Pradeep"));

        // Test case-3. Maximum value at position-3
        System.out.println("Maximum value for Case-3 is : " +FindMaximum.maximum("Lovesh","Prince","Twarit"));
        System.out.println("=========================================================================");

    }
}