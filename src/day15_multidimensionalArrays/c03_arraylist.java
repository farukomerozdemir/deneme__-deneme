package day15_multidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class c03_arraylist {
    public static void main(String[] args) {
        //arrraylist en kötü özelliği elemanları tek tek eklenmelidir
        //primiteve kabul etmiyor string kabul ediyor
        //ve de obje oluşturmadan eklenmiyor
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);
        //sayıları tek tek ekleniyor liste sırası ile oluyor sınırsız ekleniyor
        System.out.println(sayilar);//[5, 8, 3]
        sayilar.add(6);
        sayilar.add(9);
        System.out.println(sayilar);//[5, 8, 3, 6, 9]

        sayilar.add(0,11);//indeks beliritp ekleyebiliyoruz ekleyince diğerleri bir ileri kayar
        System.out.println(sayilar);//[11, 5, 8, 3, 6, 9]
        sayilar.set(0,45);//ilk şindeksi alır yerine 45 koyar
        System.out.println(sayilar);//[45, 5, 8, 3, 6, 9]
        List<Integer>rakamlar=new ArrayList<>();
        rakamlar.add(1);
        rakamlar.add(2);
        rakamlar.addAll(sayilar);
        System.out.println(rakamlar);//[1, 2, 45, 5, 8, 3, 6, 9] sayıları rakamların sonına ekledi
        sayilar.addAll(2,rakamlar);
        System.out.println(sayilar);//rakamları ikinci indeks olarak araya soktu


    }
}
