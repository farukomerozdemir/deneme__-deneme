package day05_nestedifElseTernaryswitch;

import java.util.Scanner;

public class c03_nestedifelse_soru {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
         Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */
        //switch --case---sonuna default
        //switch de değerden başlar sonuna kadar yazıdırır
        //yazdırmayı bırakmak için case sonuna break yazılır

        //switch delong double float olmaz

        System.out.println("gün no gir");
        Scanner scanner=new Scanner(System.in);
        int gunno= scanner.nextInt();
        switch (gunno%7){
            case 1:
                System.out.println("ptesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çar");
                break;
            case 4:
                System.out.println("perş");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("ctesi");
                break;
            case 0:
                System.out.println("pazar");
                break;
        }

    }
}
