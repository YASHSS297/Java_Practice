public class Main {
    public static void main(String[] args) {

        int n = 164532;

//        while(n > 0){
//
//            int lastdigit = n % 10;
//
//            System.out.print(lastdigit);
//
//            n = n / 10;
//
//        }
//        System.out.println();


        int rev = 0;
        while (n > 0) {

            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}