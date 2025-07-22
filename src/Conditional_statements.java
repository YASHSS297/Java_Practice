import java.sql.SQLOutput;
import java.util.*;

public class Conditional_statements {

    public static void main(String[] args){

        // Q1 Write a Java program to get a number from the user and print whether it is positive or negative.

       Scanner s = new Scanner(System.in);

       System.out.print("Enter your number : ");
        int n = s.nextInt();

        if (n > 0){
            System.out.println(n + " is a positive number.");
        }
        else {
            System.out.println(n + " is a negative number.");
        }



        // Q2 Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

       /* double temp = 103.5;

        if (temp >100){

            System.out.println("you are having a fever.");
        }
        else {
            System.out.println("you are ok, you dont have any fever.");
        }

        */

        // Q3 Write a Java program to input week number(1-7) and print day of week name using switch case.

    /*    System.out.print("Enter a week day : ");
        int day = s.nextInt();
        switch (day){

            case 1 :
                System.out.println("The day is Monday.");
                break;

            case 2 :
                System.out.println("The day is Tuesday");
                break;

            case 3 :
                System.out.println("The day is Wednesday.");
                break;

            case 4 :
                System.out.println("The day is Thursday.");
                break;

            case 5:
                System.out.println("The day is Friday.");
                break;

            case 6 :
                System.out.println("The day is Saturday.");
                break;

            case 7:
                System.out.println("The day is Sunday.");
                break;

                default :
                    System.out.println("invalid week days.");
                    break;
        }

     */


        // Q4 What will be the value of x & y in the following program:

     /*   int a = 63, b = 36;

        boolean x = (a < b ) ? true : false;
        System.out.println(x);

        int y= (a > b ) ? a : b;
        System.out.println(y);

      */


        // Q5 Write a Java program that takes a year from the user and print whether that year is a leap year or not.

    /*    System.out.println("Enter your year : ");
        int year = s.nextInt();

        if (year%4==0 || year%400==0 || year%100==0){

            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }


     */
    }
}
