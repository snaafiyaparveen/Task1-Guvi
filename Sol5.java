package Task1;

import java.util.Scanner;

public class Sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double disount = 0;
        double price = 0;

        System.out.println("Enter the purchased amount: ");
        double x = sc.nextDouble();

        if(x <= 500){
            System.out.println("Sorry! No discount is applied");
        } else if (x > 500 && x < 1000 ) {
            disount = x * 0.1;
            price = x - disount;
            System.out.println("The discount amount is " + disount);
            System.out.println("The amount to be paid is "+ price);
        } else if (x > 1000) {
            disount = x * 0.2;
            price = x - disount;
            System.out.println("The discount amount is " + disount);
            System.out.println(("The amount to be pad is "+ price));
        }
    }
}
