import java.sql.SQLOutput;
import java.util.*;

public class do_while_and_breakStatement {

    public static void main(String[] args) {
        //Q1 print number 1 to 5 but exit when 3 appers


      /*  for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out");


       */


        //Q2 keep entering numbers till users enters a multiple of 10

        Scanner s = new Scanner(System.in);

        do {
            System.out.print("Enter your number: ");
            int n = s.nextInt();

            if (n%10==0){
                break;
            }
            System.out.println("the number is : " + n);
        } while (true);

    }
}