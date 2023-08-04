package day100;

import java.util.Scanner;

public class c01_switchstatment {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("gün numarasını yazınız");
        int gunno=scan.nextInt();
        switch (gunno){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");break;
            case 4:
                System.out.println("perşembe");break;
            case 5:
                System.out.println("cuma");break;
            case 6:
                System.out.println("ctesi");break;
            case 7:
                System.out.println("pazar");break;

            default:
                System.out.println("geçersiz gün");break;

        }
    }
}
