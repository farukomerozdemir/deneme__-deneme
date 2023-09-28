package day04_ifelse_statments;

public class c02ifstatments {
    public static void main(String[] args) {
        int a =25;
        int b =40;
        if (a>b){
            System.out.println("a bden büyüktür");
        }
        if (a%5==0){
            System.out.println("a beşe bölünür");
        }
        if(a<50&&a%5==0){
            System.out.println("a elliden küçük beşe bölünebilen sayıdır");
        }
//tüm if bdoyleri çalışabilr ya da hiç brii çalışmayabliir
        // {} ifin body kısmıdır
        boolean sart=a+b>50;
        if (sart) System.out.println("a b toplamı 50 den büyük");
    }
}
