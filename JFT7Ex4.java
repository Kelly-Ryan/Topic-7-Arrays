/*
Kelly Ryan
14 December 2018

Exercise 4

 Write a Java program to store the names of the four Irish provinces (Connacht, Leinster, Munster and Ulster).
 Use an array as part of your solution. Declare, initialise and populate the array on one line using the comma separated approach.
 Display the number of Irish provinces and the names stored in the array, using a series of System.out.println() statements.
 Save the program as JFT7Ex4.java
*/

public class JFT7Ex4 {

    public static void main (String[] args) {

        String[] provinces = {"Connacht", "Leinster", "Munster", "Ulster"};

        System.out.println("There are "+provinces.length+" provinces in Ireland.");
        System.out.println("Their names are:");

        int i = 0;
        System.out.println(provinces[i++]);
        System.out.println(provinces[i++]);
        System.out.println(provinces[i++]);
        System.out.println(provinces[i++]);

    }

}
