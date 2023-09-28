package day13_Arrays;

public class c07_arrays {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.
        int []arr={3,3,3,2,34,5,8,0,89};
        int aranansayi=3;
        aranansayikaçtane(arr,aranansayi);//aranan eleman arrayde  3kere kullanıolmıştır

    }
public static void aranansayikaçtane (int[]arr,int aranansayi)
{

    int sayac=0;
    for (int i = 0; i <arr.length ; i++) {if (arr[i]==aranansayi){sayac++;}

    }
    if (sayac==0){
        System.out.println("aranan eleman yok");
    }else System.out.println("aranan eleman arrayde  "+sayac+"kere kullanıolmıştır");

}
}
