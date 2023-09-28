package day02t127;

public class c06_expliseddatacasting {
    public static void main(String[] args) {
        int a =13;
        int b=200;
       // byte c= a; kabul etmedi kızardı
        byte c=(byte) a; //explised yhaptık kabul ettii (byte) dar da olsa kabul etti 13 dığmasaydı kalanı gösterecekti
        System.out.println(c);
        c=(byte)b;
        System.out.println(c); // b c ye sığmayınca daraltıp gönderdi -56 verdi
        //byt sınırları -128,127 dir 256 elelmanı vardır256 0 dır

    }
}
