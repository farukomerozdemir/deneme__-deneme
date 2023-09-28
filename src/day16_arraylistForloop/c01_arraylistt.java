package day16_arraylistForloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c01_arraylistt {
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>();
        isimler.add("deniz");
        isimler.add("omer");
        isimler.add("esra");
        isimler.add("hamza");
        isimler.add("basak");
        System.out.println(isimler.remove(2));//esra silindi diye esra geldi
        System.out.println(isimler);//[deniz, omer, hamza, basak]
        System.out.println(isimler.remove("hamza"));//true object verirsek
        System.out.println(isimler);//[deniz, omer, basak]
        List<String>isimler2=new ArrayList<>();
        isimler2.add("deniz");
        isimler2.add("omer");
        System.out.println(isimler.removeAll(isimler2));//true
        System.out.println(isimler);//basak
        List<Integer>isimler3=new ArrayList<>();
        isimler3.add(2);
        isimler3.add(3);
        isimler3.add(12);
        System.out.println(isimler3.remove(2));//2 yazınca indeks 2 yi sildi
        Integer sayi=2;
        System.out.println(isimler3.remove(sayi));//true
        System.out.println(isimler3);//[3]
        isimler3.clear();System.out.println(isimler3);//[]
        isimler3.add(20);
        isimler3.add(3);
        isimler3.add(12);
        System.out.println(isimler3);//[20, 3, 12]
        //direk sort yok listte Collections klasından sort
        Collections.sort(isimler3);//[ 3, 12 ,20,]
        System.out.println(isimler3);//[ 3, 12 ,20,]

    }
}
