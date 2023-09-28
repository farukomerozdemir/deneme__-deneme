package day15_multidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class c06arraylist {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        System.out.println(sayilar.size());//0 boş lenght yok size var
        sayilar.add(5);
        sayilar.add(0,7);
        System.out.println(sayilar);//[7, 5]
        System.out.println(sayilar.size());//2 oldu 2 elelman ekledik
        System.out.println("liste boş mu   :"+sayilar.isEmpty());//false doldurduk
        System.out.println(sayilar.contains(7));//true
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);

        List<Integer>rakamlar=new ArrayList<>();
        rakamlar.add(3);
        rakamlar.add(8);
        rakamlar.add(5);
        System.out.println(sayilar.containsAll(rakamlar));//true hepsini içeriryor
        //contains sıralama önemsemez

    }
}
