package Task1;

public class Sol6 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                for (int k = i; k <=1 ; k++) {

                    if (j<i){
                        System.out.print(n-i+1);
                    }else
                        System.out.print(n-j+1);
            }
            }
            System.out.println();
        }
    }
}

//55555
//54444
//54333
//54322
//54321
