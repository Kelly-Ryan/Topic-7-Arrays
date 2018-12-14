/*
Kelly Ryan
10 December 2018

Exercise 2

 Write a Java program to store the salary amounts of five employees.
 The salaries to be stored are:
o 24000.50
o 30432.54
o 29454.54
o 45000.00
o 20500.00
 Use an array as part of your solution.
 Assume that you need to store floating point numbers.
 Which attribute of the array object can be used to display its length?
o Use this attribute to display the number of employees (whose salary details are stored).
 Display the contents of the array using a series of System.out.println() statements.
 Save the program as JFT7Ex2.java
 */

public class JFT7Ex2 {

    public static void main (String[] args){

        float[] salaries = {24000.50f, 30432.54f, 29454.54f, 45000.00f, 20500.00f};

        System.out.println("The number of employees whose salary details are stored is "+salaries.length+".");

        //using a for loop to iterate through the elements in the array and display them.
        System.out.println("Using a for loop - Their salaries are:");

        for(int i = 0; i < salaries.length; i++){
            System.out.println(salaries[i]);
        }

        //using a series of System.out.println() statements to print each element of the array.
        System.out.println("Using System.out.println() statements - Their salaries are:");

        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);
        System.out.println(salaries[3]);
        System.out.println(salaries[4]);

    }
}
