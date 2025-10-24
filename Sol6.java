package Task1;

public class Sol6 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 5; i >= 1 ; i--) {
            int a = 5;
            for (int k = 0; k < x; k++) {
                System.out.print(a);
                a--;
            }
            for (int j = 1; j <= 5 - x ; j++) {
                System.out.print(i);
            }
            System.out.println();
            x++;
        }
    }
}
