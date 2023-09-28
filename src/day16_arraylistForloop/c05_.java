package day16_arraylistForloop;

import java.util.List;
import java.util.Scanner;

public class c05_ {
    public static void main(String[] args) {
      /*
       Kullanicidan Kullanicidan sifre

        isteyin asagidaki sartlari saglamayan
        sifrelerde hatalari yazdirip,
                kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu
        islemi tekrar edin gecerli sifre
        yazilinca “sifreniz basari ile
        kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf
        olmali
                - sifrenin son karakteri sayi olmali*/
        String sifre=null;
        boolean bl=true;

        while (bl){
            Scanner scanner=new Scanner(System.in);
            System.out.println("lütfen şifrenizi oluşturunuz");
            sifre=scanner.nextLine();
            {if (!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z')) System.out.println("ilk harf küçük olmalı");}

        }




    }
    }

