package Arrays;

import java.util.Arrays;

public class Frekans {
    public static void main(String[] args) {
        int j,i=0;
        int [] list = {1,1,3,3,3,6,6,6,6,3,2,1,4,4};
        int sayac = 0;
        System.out.println("Sayılar  :");
        Arrays.sort(list);
        for ( i =0;i < list.length;i++){
            for (j=0;j < list.length; j++){
                if(list[i] == list[j]){
                    sayac +=1;
            }

            }
            if(list[i] != list[i+1]) {
                System.out.println(list[i] + " sayısı " + sayac + " kez tekrar edildi. ");
            }
            if(list[i] == list[list.length-1] && i == list.length-2 ) {
                System.out.println(list[list.length-1] + " sayısı " + sayac + " kez tekrar edildi. ");
            }
            sayac = 0;
        }


    }
}
