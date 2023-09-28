package practise03;

import java.util.Scanner;

public class c03_ifelsess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not= scanner.nextInt();
        if(not>=85&&not<=100){
            System.out.println("notunuz AA");
        }
        else if(not>=80&&not<85){
            System.out.println("not AB");
        } else if (not>=75&&not<80) {
            System.out.println("not BB");

        }
        else if (not>=70&&not<75) {
            System.out.println("not CB");

        }else if (not>=60&&not<70) {
            System.out.println("not CC");

        }
        else if (not>=55&&not<60) {
            System.out.println("not DC");

        }
        else if (not>=45&&not<55) {
            System.out.println("not DD");

        }else if (not>=0&&not<45) {
            System.out.println("not F kaldınız");

        }
        else System.out.println("notunzuu doğru giriniz");


    }
}
