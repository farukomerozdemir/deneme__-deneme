package practise01;

import java.util.Scanner;

public class örnekler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pls bir sayı gir");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");

            }
        }
    }
}
