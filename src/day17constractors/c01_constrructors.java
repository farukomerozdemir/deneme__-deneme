package day17constractors;

import java.util.Random;

public class c01_constrructors {
    int sayi=6;
    String str="Java candir";
    public void rastgeleSayiUret(){
        Random random=new Random();
        int rastgeleSayi= random.nextInt(1000);
        System.out.println("Bugünki şanslı sayi:"+rastgeleSayi);
    }
    public void bugunneyapayim(){
        String[]yemekler={"kurufasülye","pilav","cacık","makarna","mercimek"};
        Random random=new Random();
        int yemekno= random.nextInt(yemekler.length);
        System.out.println("bugün yemek :"+yemekler[yemekno]);
    }
}
