package day06_StrimgManipulation;

import java.util.Scanner;

public class c03_equalsİgnoreCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("harf giriniz");
        char girilenharf=scanner.next().charAt(0);
        //kullanııcı butuk kukcuk hargf girmiş olabilir
        //strinleri gözetmeksizin karşıaştırabilriiz
        //space karakterdir equlasignore cese onu da fark eder

        String harf=girilenharf+"";
        if (harf.equalsIgnoreCase("a")) {
            System.out.println("aile");
        } else if (harf.equalsIgnoreCase("i")) {
            System.out.println("iş");

        }else {
            System.out.println("bu hARFİ BİLMİYORUM");
        }
    }
}
