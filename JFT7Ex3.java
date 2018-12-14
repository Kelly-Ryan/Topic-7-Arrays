/*
Kelly Ryan
14 December 2018

Exercise 3
 Write a Java program to store the ages of 6 students in a class.
 The ages to be stored are:
o 16
o 16
o 17
o 16
o 17
o 16
 Use an array as part of your solution.
 Assume that you need to store whole numbers only.
 Display the number of students and their ages using a series of System.out.println()
statements.
 Save the program as JFT7Ex3.java
 */

public class JFT7Ex3 {

    public static void main (String[] args) {

        int[] studentAges = {16, 16, 17, 16, 17, 16};

        System.out.println("There are "+studentAges.length+" students.");
        System.out.println("Their ages are:");
        System.out.println(studentAges[0]);
        System.out.println(studentAges[1]);
        System.out.println(studentAges[2]);
        System.out.println(studentAges[3]);
        System.out.println(studentAges[4]);
        System.out.println(studentAges[5]);

    }
}
