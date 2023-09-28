package day09forloopsMetodolusturma;

import java.util.Scanner;

public class c04_stringCevirme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ters isiteğiniz cümleyi yazınız");
        String girilenmetin= scanner.nextLine();
        String tersmetin="";
        for (int i = girilenmetin.length()-1; i >= 0; i--) {
            tersmetin+=girilenmetin.charAt(i);

        }
        System.out.println(tersmetin);
    }
}
