/*
Kelly Ryan
10 December 2018

Exercise 1

Write a Java program to store the names of the months of the year.
 Use an array as part of your solution.
 Display the contents of the array using a series of System.out.println() statements.
 Save the program as JFT7Ex1.java.

 */

public class JFT7Ex1 {

    public static void main (String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        //using a for loop to iterate through the elements of the array and display them.
        System.out.println("1. Displaying array contents using a for loop:");
       for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        //using a series of System.out.println() statements to print each element of the array.
        System.out.println("2. Displaying array contents using series of System.out.println() statements:");
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);
    }

}
