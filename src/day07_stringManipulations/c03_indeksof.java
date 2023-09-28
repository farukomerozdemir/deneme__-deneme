package day07_stringManipulations;

import java.util.Scanner;

public class c03_indeksof {
    public static void main(String[] args) {
        // Verilen bir cumlede
// aranan bir metin icin asagidaki cumlelerden
// uygun olani yazdiracak bir program yaziniz
// - Cumle aranan metni icermiyor
// - Cumlede aranan metin sadece 1 kere kullanilmis
// - Cumlede aranan metin sadece 2 kere kullanilmis
// - Cumlede aranan metin 2'den fazla kullanilmis
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen cümle girşiniz");
        String cumle= scanner.nextLine();
        System.out.println("lütfen aranacak meti giriniz");
        String metin=scanner.nextLine();

        int ilkindex=0;
        int ikinciindex=0;
        int ucuncuindeks=0;

        ilkindex=cumle.indexOf(metin);//-1 yada indexi verir
        if (ilkindex==-1){
            System.out.println("cumlede aranan metin yok");
        }

        {

        }



    }
}
