import com.sun.xml.internal.ws.resources.UtilMessages;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            double principal, rate, numOfYears, compound, finalAns = 0;
            System.out.print("What is the principal amount? ");
            principal = scan.nextDouble();
            System.out.print("What is the rate? ");
            rate = scan.nextDouble() / 100;
            System.out.print("What is the number of years? ");
            numOfYears = scan.nextDouble();
            System.out.print("What is the number of times the ineterest is compounded per years? ");
            compound = scan.nextDouble();
            // calculate A = P(1 + r/n)^(n*t) and round to 2 decimal places.
            finalAns = (double) Math.round(100 * (principal * Math.pow((1 + rate / compound), (compound * numOfYears)))) / 100;
            System.out.println("$" + principal + " invested at " + (rate * 100) + "% for " + numOfYears + " years compounded " +
                                compound + " times per year is $" + finalAns);
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
