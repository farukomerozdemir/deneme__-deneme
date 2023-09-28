package day17constractors;

public class c04_hemsirerunner {
    public static void main(String[] args) {
        c03_hemsire hemsire1=new c03_hemsire();
        //c03 hemşire clasıından instance olanları hemsireadı,hemsiretel
        // ,hemsireadres null olarrak kayderder hemsire1 de artık bunlar var
        // ,hastane adı =yıldız , hastaneadresi=cankaya , hastanebashekimi=ali
        // .
        hemsire1.hemsireadi="esra";
        hemsire1.hemsireadi="yenimahalle";
        c03_hemsire hemsire2=new c03_hemsire();
        //yeni bir hemşire costructer ile yaptık()bu konstucter ile
        System.out.println(hemsire2.hemsiretel);//null
        System.out.println(hemsire2.bashekim);//ali murtaza diğer klastan getirdi



    }
}
