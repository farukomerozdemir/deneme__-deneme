package day03_wrapperClassincrementDecrement;

public class c06_Concatination {
    public static void main(String[] args) {
        String str="hello";
        String str2="world";
        int sayi=5;
        int sayi2=8;
        System.out.println(str+str2);//helloworld
        System.out.println(str+sayi);//hello5
        System.out.println(str+sayi2+sayi*sayi);//hello825 önce çarpöayı yapar sonra concatination yapar
        System.out.println(sayi2+sayi+str);//13hello ilk string gelmeden toplamöa yapar string gelince concet yapar

    }
}
