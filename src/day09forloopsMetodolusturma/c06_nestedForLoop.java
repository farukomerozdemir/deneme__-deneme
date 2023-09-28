package day09forloopsMetodolusturma;

public class c06_nestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i * j + " ");
                //i sütun sayısı j satır saıyısı
            }
            System.out.println("");
        }
    }
}
