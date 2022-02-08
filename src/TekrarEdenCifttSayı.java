package Arrays;

import java.util.Arrays;

public class TekrarEdenCifttSayı {
    public static void main(String[] args) {
        int [] list= {2,5,7,3,2,4,4,6,7,1,6};
        int duplicate [] = new int[list.length];
        int starterindex=0;
        for (int i=0;i< list.length;i++){
            for (int j=0 ; j<list.length;j++){
                if (i!=j && list[i]==list[j] & list[i]%2==0 && list[j]%2==0){
                    if (!IsFind(duplicate,list[i])){
                        duplicate[starterindex++]=list[i];

                    }
                    break;
                }

            }
        }
        for (int i:duplicate) {
            if (i!=0){
                System.out.println(i);
            }

        }
    }
static boolean IsFind(int [] arr,int value){
    for ( int i: arr) {
        if (i == value){
            return true;
        }

    }
    return false;
}










}

