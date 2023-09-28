package day02t127;

public class c05_dataCasting {
    public static void main(String[] args) {
        int sayi=34;
        String str="java candır";
        boolean bl=true;
        char chr='½';
        double dbl=4.5;
        byte byt=10;
        short shrt=23;
        shrt=byt;
        dbl=byt;
        dbl=chr;
        System.out.println(dbl);
        //char saısal değeri veriyor
        shrt=byt;
        System.out.println(shrt);
    }
}
