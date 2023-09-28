package day13_Arrays;

public class c05_enuzunkelime {
    public static void main(String[] args) {
         /*
        Soru 6- Verilen String bir array’deki
        en uzun ve en kisa kelimeleri yazdiran bir method olusturun.


         */
        String [] isimler={"hüseyin","Mehmet","Esra","ercan","omer","ali"};
        enuzunenkisayazdir(isimler);

    }

    public static void enuzunenkisayazdir (String[]arr){
        String enkisaisim=arr[0];
        String enuzunisim=arr[0];//hata yapmamak için "" boşluk atamadık
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()>enuzunisim.length()){enuzunisim=arr[i];}
            if (arr[i].length()<enkisaisim.length()){enkisaisim=arr[i];}


        }
        System.out.println(enkisaisim+"  en kısa isim");
        System.out.println(enuzunisim+"  en uzun isim");





    }
}
