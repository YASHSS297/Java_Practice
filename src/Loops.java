import java.util.Scanner;

public class Loops {
    public static void main (String[] args) {

        // Q1 Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

      /*  Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("How many integers do you want to enter? ");
        int count = scanner.nextInt();

        System.out.println("Enter " + count + " integers:");

        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);


       */

        // Q2 Write a program to find the factorial of any number entered by the user.

       /* Scanner s = new Scanner(System.in);

        System.out.println("Enter your number: " );
        int n = s.nextInt();

        int fact = 1;
        for (int i = 1;i<=n;i++){
            if (fact ==0){
                System.out.println("factorial of a number is : " + 1);
            }
            fact = fact * i;
        }

        System.out.println("factorial of a number is : " + fact);

        */

        // Q3 Write a program to print the multiplication table of a number N, entered by the user.

      /*  Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of the table : ");
        int n = s.nextInt();

        for (int i = 1;i<=10;i++){
            int mul = n*i;
            System.out.println( n +"x" + i + "=" + mul);
        }
        System.out.println("This is your required table.");


       */

        // Q4 Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter integers (type '0' to stop):");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
