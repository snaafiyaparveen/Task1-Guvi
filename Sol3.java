package Task1;

import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to be reversed: ");
        int num = sc.nextInt();
        int rev = 0 ;

         while(num!=0){
             int val = num % 10;
             rev = rev * 10 + val;
             num /= 10;

         }

        System.out.println(rev);




    }
}
