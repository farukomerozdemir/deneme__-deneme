package day09_nestedifelse;

public class c10_methodOluşturma {
    public static void main(String[] args) {
        String str="SEvim  bak kim gelmiş";
        str.toUpperCase();
        //str içindeki metod
        System.out.println(str.toLowerCase());//sevim  bak kim gelmiş metod call yaptık ama atamadık
        System.out.println(str);//SEvim  bak kim gelmiş
        str=str.toUpperCase();
        System.out.println(str);//SEVİM  BAK KİM GELMİŞ atama yapınca str değişti
    }
}
// requiretment Google isiitiyor google çıkıyor aynı diyemez bug var deriz