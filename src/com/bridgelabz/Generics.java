package com.bridgelabz;

public class Generics {

    public static void main(String[] args) {

        // ----> Generics Integer Type <----
        int intX = 100, intY = 90, intZ = 80;
        int intTestCase = new FindMaximum<Integer>(intX, intY, intZ).maximumNum();
        System.out.println("Maximum value is : " +intTestCase);
        System.out.println("=========================================================================");

        // ----> Generics Float Type <----
        float floatX = 14.4f, floatY = 13.3f, floatZ = 12.2f;
        float floatTestCase = new FindMaximum<Float>(floatX,floatY,floatZ).maximumNum();
        System.out.println("Maximum value is : " +floatTestCase);
        System.out.println("=========================================================================");

        // ----> Generics String Type <----
        String stringX = "Surendra", stringY = "Gaurav", stringZ = "Pradeep";
        String stringTestCase = new FindMaximum<String>(stringX,stringY,stringZ).maximumNum();
        System.out.println("Maximum value is : " +stringTestCase);
        System.out.println("=========================================================================");

    }
}