package day15_multidimensionalArrays;

public class c02_mda_tümelelmanlarıtoplama {
    public static void main(String[] args) {int[][]arr11={{1},{1,2},{3,4,8}};
arrayelemantoplayazdir(arr11);

    }


    public static void arrayelemantoplayazdir(int[][]toplancakarray){

        int toplam=0;
        for (int i = 0; i <toplancakarray.length ; i++) {

            for (int j = 0; j <toplancakarray[i].length ; j++) {
                System.out.print(toplancakarray[i][j]+" ");
                toplam+=toplancakarray[i][j];


            }


        }System.out.print("toplam= "+ toplam);




    }
}
