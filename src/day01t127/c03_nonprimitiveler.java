package day01t127;

public class c03_nonprimitiveler {
    public static void main(String[] args) {
        int sayi=10;
        String str="candiir java";
        System.out.println(str.toUpperCase());//CANDİİR JAVA
        System.out.println(str);//candiir java
        //hazır metod stryi düzeltmez sadec o anlık kullandırıır..**stribg dehazır metodlar değiştirmez atama yapmadıkça**
        str=str.toUpperCase();
        System.out.println(str);//CANDİİR JAVA
        
        //veriable isimleri case sensitivedir
        //veriable isimleri boşluk içeremez


    }
}
