package day13_Arrays;

import java.util.Scanner;

public class c07_soruunacci {
    public static void main(String[] args) {
        //Verilen bir kelime
        // 2 ile 4 arasında 'a'karakter iceriyorsa dogru, icermiyorsa yanlıs
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir kelime yada cümle girin kaç tane a içerdiğini bullaım");
        String kelime=scanner.next();
        //kelime yada cümlede a içeriyor mu
        System.out.println("aradığınız harfi girin");
        char arananharf=scanner.nextLine().charAt(0);
        // a hsrfi cümlede mevcut
        // a harfi cümlede şu kadarr var
        String ikincikelime=kelime.toUpperCase();
        if (ikincikelime.contains(arananharf+""));
        { System.out.println("metinde "+arananharf+" vardır");}
    }
}
