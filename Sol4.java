package Task1;

import java.util.Scanner;

public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x>y && x>z ){
            System.out.println(x + " is greater");
        } else if (y>x && y>z) {
            System.out.println(y + " s greater");
        }else
            System.out.println(z + " is greater");
    }
}
