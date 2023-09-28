package day07_stringManipulations;

public class c02_indexof {
    public static void main(String[] args) {
        String str="Java candir,Selenium heyecan";
        System.out.println(str.contains("Selenium"));//true var mı
        System.out.println(str.indexOf("Selenium"));//12 indeks başşlangıç değeri
        System.out.println(str.indexOf("x"));//-1 yok demektir
        System.out.println(str.indexOf("Java"));//0 yani ilk kelime
        //indexof kısmına ctrl tuşu ile gelirsek açıklamaısnı ingilizce olarak gösterir
        System.out.println(str.indexOf("a"));
        //ikinci a bul
        System.out.println(str.indexOf("a",2));//3

    }
}
