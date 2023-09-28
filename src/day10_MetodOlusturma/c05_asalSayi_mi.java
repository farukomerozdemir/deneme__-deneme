package day10_MetodOlusturma;

public class c05_asalSayi_mi {
    public static void main(String[] args) {
        asalsayimi(3);
        asalsayimi(14);
       asalsayimi(145);
    }

    public static void asalsayimi(int sayi) {
        boolean flag = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag = false;
            }

        }
        if (flag == false) {
            System.out.println(sayi +" asal değildir");
        }
        if (flag == true) {
            System.out.println(sayi+ "  asaldır ");
        }

    }
}

