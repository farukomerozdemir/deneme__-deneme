package practise01;

public class c04praccons {
    String title;
    String yazar;
    int yayinyili;

        public c04praccons(String title,String yazar,int yayinyili){
            this.title=title;
            this.yazar=yazar;
            this.yayinyili=yayinyili;
    }

    public static void main(String[] args) {
        c04praccons book=new c04praccons("java","ahmet",2023);
        System.out.println(book.title);
        c04praccons book2=new c04praccons("ömer","dingillik",2024);
        System.out.println(book2.title);
    }
}
