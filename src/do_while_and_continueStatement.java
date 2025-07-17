import java.util.*;

public class do_while_and_continueStatement {

    public static void main(String[] args){

        // Q1 print the numbers 1 to 5 but skip the ierations whern numbers appers 3.

        /*for (int i=1; i<=5; i++){

            if( i==3 ) {

                System.out.println("the number is skeeped.");
                continue;
            }
            System.out.println(i);
        }


        */


        //Q2 dispaly all the numbers entered by the except multiples of 10.


        Scanner s = new Scanner(System.in);

        do {
            System.out.print("Enter your number : ");
            int n = s.nextInt();

            if ( n%10==0 ){
                System.out.println("sorry we skipped this number.");
                continue;
            }
            System.out.println("the number is :" + n);
        }while (true);
    }
}
