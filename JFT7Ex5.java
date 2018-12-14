/*
Kelly Ryan
14 December 2018

Exercise 5

 Write a Java program to store information about university students. Specifically, you wish to store information about:

o Name
o Age
o Degree Programme
 Create three separate arrays as part of your solution.
o The first array should stores names.
o The second array should stores ages.
o The third array should store degree programmes.

 Populate the arrays with information about three students.

 John Hayes
 30
 Sports Science

 Michele Smyth
 24
 Law

 Frankie Walsh
 20
 Computer Science

 Display the number of students whose details are stored, and the contents of each array.

 Note: \t can be used to create a tab effect in the output. Add "\t" to your output string after you output the contents of an array. For example: names[0] + "\t"

 Save the program as JFT7Ex5.java

*/

public class JFT7Ex5 {

    public static void main (String[] args) {

        String[] studentNames = {"John Hayes", "Michele Smyth", "Frankie Walsh"};
        int[] studentAges = {30, 24, 20};
        String[] degreeProgrammes = {"Sports Science", "Law", "Computer Science"};

        System.out.println("No. of students whose details are stored: "+studentNames.length);
        System.out.println("Name: "+studentNames[0]+"\t"+"Age: "+studentAges[0]+"\t"+"Degree Programme: "+degreeProgrammes[0]);
        System.out.println("Name: "+studentNames[1]+"\t"+"Age: "+studentAges[1]+"\t"+"Degree Programme: "+degreeProgrammes[1]);
        System.out.println("Name: "+studentNames[2]+"\t"+"Age: "+studentAges[2]+"\t"+"Degree Programme: "+degreeProgrammes[2]);

    }
}
