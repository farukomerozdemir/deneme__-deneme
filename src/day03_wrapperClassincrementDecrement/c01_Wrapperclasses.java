package day03_wrapperClassincrementDecrement;

public class c01_Wrapperclasses {
    public static void main(String[] args) {
        int sayi=20;
        String str1="Java";
        String str2="java nedir";
        Integer sayi2=20;
        sayi=sayi2;
        sayi2=sayi;
        char ch1='j';

        Character ch2='k';
        // büüyük harfle başalayanlar wrapper classlar oluşur hazır medtodları kulanabiliriz.

        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(str1+str2);;//Javajava nedir
        System.out.println(Character.isLetter(ch1));//true

        //String metin=18; kabul etmiyor
        String metin=18 +""; //kabul etti ve sadece 18 olan string yaptık
        System.out.println(metin); //18


    }
}
