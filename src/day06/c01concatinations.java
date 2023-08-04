package day06;

public class c01concatinations {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("verilen iki değerin toplamı "+ (a +b));
          a=a+10;
        System.out.println("verilen iki değerin toplamı "+ (a +b));
        System.out.println(a==b);
        boolean c=20==a;
        System.out.println(c);
        System.out.println(c=20!=a);
        int d=15;
        int f=25;
        System.out.println(f>d&&a>b-15);
        //&& daha hızlıdır sonuç yanlış olur olmaz işlemi durdurur
        System.out.println(f<d||a>b-15);
    }
}
