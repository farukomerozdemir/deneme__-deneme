package day16_arraylistForloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c03_listsoru {
    public static void main(String[] args) {
       /*
        Soru 2- Kullanicidan istedigi kadar isim alip,
         Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
         bir method olusturun.
        */
        System.out.println(listeolustur());

    }
    public static List<String>listeolustur(){
        List<String>isimler=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String girilenisim;
        do {
            System.out.println("listeye kelmek için bir isim girin "+"veya işlemi sonlandırmak için Q ya basın");
            girilenisim=scanner.nextLine();
            { if (!girilenisim.equalsIgnoreCase("q"))
            {isimler.add(girilenisim);}}


        }while (!girilenisim.equalsIgnoreCase("q"));




return isimler;
    }
}
