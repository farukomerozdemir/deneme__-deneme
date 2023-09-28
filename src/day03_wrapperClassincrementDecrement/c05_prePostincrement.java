package day03_wrapperClassincrementDecrement;

public class c05_prePostincrement {
    public static void main(String[] args) {
        int a=20;
        System.out.println(a);
        a++;
        int b =a;
        System.out.println("a="+a+" b:"+b);
        b=a++; //önce atama yapar sonra ayı arttır
        System.out.println("a="+a+" b:"+b);
        b=++a; //öncec ayı artırıp sonra atar
        System.out.println("a="+a+" b:"+b);
        int c=40;
        System.out.println(c++);//40
        System.out.println(c);//41
        System.out.println(++c);//42
        System.out.println(c);//42

    }
}
