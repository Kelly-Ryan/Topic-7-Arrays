/*
Kelly Ryan
14 December 2018

Exercise 6

 Create a Java program, which will store the names of the following currencies in an array named currencies.
o GBP
o USD
o JPY

 Create a second array named exchangeRates. Store the exchange rate for each currency.
o 0.718836
o 1.12370
o 138.682

 Output the contents of the arrays in a logical order.
o GBP 0.718836
o USD 1.12370
o JPY 138.682

 Using the information stored in the program, convert an amount of €100 to each of the stated currencies. Display the results of the conversions.
o 100 Euro converted to GPB is:
o 100 Euro converted to USD is:
o 100 Euro converted to JPY is:

 Save the program as JFT7Ex6.java

*/

public class JFT7Ex6 {

    public static void main (String[] args) {

        String[] currencies = {"GBP", "USD", "JPY"};
        float[] exchangeRates = {0.718836f, 1.12370f, 138.682f};
        float euroAmount = 100f;

        System.out.println(currencies[0]+"\t"+exchangeRates[0]);
        System.out.println(currencies[1]+"\t"+exchangeRates[1]);
        System.out.println(currencies[2]+"\t"+exchangeRates[2]);

        System.out.println(euroAmount+" Euro converted to "+currencies[0]+" is: "+euroAmount*exchangeRates[0]);
        System.out.println(euroAmount+" Euro converted to "+currencies[1]+" is: "+euroAmount*exchangeRates[1]);
        System.out.println(euroAmount+" Euro converted to "+currencies[2]+" is: "+euroAmount*exchangeRates[2]);
    }
}

