package day36_datatypekullanımıoverriding;

public class dveriablerunner {
    public static void main(String[] args) {
        cavcikuslar avcikuskartal=new cavcikuslar();

        System.out.println(avcikuskartal.beslenme);


        bkuslar kuskartal=new cavcikuslar();
        System.out.println(kuskartal.beslenme);
        ahayvan hayvankartal=new cavcikuslar();
        System.out.println(hayvankartal.beslenme);
        System.out.println(hayvankartal.solunum);
    }
}
