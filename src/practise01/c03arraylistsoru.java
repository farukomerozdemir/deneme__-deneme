package practise01;

import java.util.Scanner;

public class c03arraylistsoru {
    public static void main(String[] args) {
        // 4x2'lik bir multidimension array oluşturun ve içine çeşitli şehir
        // ve nüfus bilgileri ekleyin.
        // Daha sonra kullanıcıdan bir şehir adı alarak,
        // bu şehrin nüfusunu ekrana yazdırın.
        String[][] sehirlernufuslar={
                {"ankara","5000000"},
                {"kırıkkale","277000"},
                {"adana","2000000"},
                {"elazığ","450000"},
                {"amsterdam","1100000"}};
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir şehir adı giriniz");
        String aranansehir= scan.next();
        boolean kontrol=false;
        for (int i = 0; i < sehirlernufuslar.length ; i++) {
            if (aranansehir.equalsIgnoreCase(sehirlernufuslar[i][0])){
                System.out.println(aranansehir+"şehir nüfusu:"+sehirlernufuslar[i][1]);
                kontrol=true;
                break;

            }



    }if (!kontrol){
            System.out.println("sehr mevcut değil");

        }
}}

