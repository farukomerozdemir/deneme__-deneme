package practise03;

import java.util.Scanner;

public class c02_ifElse {
    public static void main(String[] args) {
        //gün adı al hafata içii ya da sonu yaz
        Scanner scanner=new Scanner(System.in);
        System.out.println("bugün hangi gün");
        String gun= scanner.nextLine().toUpperCase();
        if (gun.equals("PAZAR")||gun.equals("CUMARTESİ")){
            System.out.println("hafta sonu");}
    else System.out.println("haftaiçi");}

}
