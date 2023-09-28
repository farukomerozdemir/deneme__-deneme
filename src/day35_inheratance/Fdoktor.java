package day35_inheratance;

public class Fdoktor extends emuhasebe{
    Fdoktor(){super(3);
        System.out.println("parametresiz doktor kons çalıştı");
    }
    Fdoktor(int a){
        System.out.println("intlikons çalıştı");
    }Fdoktor(String str){
        System.out.println("strli konst doktor çalıştı");
    }

    public static void main(String[] args) {
       // Fdoktor doktor1=new Fdoktor("java");
        Fdoktor doktor2=new Fdoktor();


    }
}
