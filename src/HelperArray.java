public class HelperArray {
    // Aşağıdaki Printmetotlar Arrays.toString() yerine geçer
    static void print(int []arr){
       System.out.print("[");
        for (int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } System.out.print("]");
    }
   static void print(double []arr){
        System.out.print("[");
        for (int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } System.out.print("]");
    }   //===========================================================
    // Aşağıdaki fill metot u  Arrays.fill() metotu yerine geçer
    static int [] fill(int [] arr,int value){
        for (int i=0;i<arr.length;i++){
            arr[i]=value;
        }
        return arr;

        //============================================================
        //Aşağıdaki fill metotu Arrays.fill() metonunda belirli elemanları değiştirmenin yerine geçer
    }static int [] fillfromto(int[] arr, int from, int to , int value){
        for (int j = from ;j<to;j++){
                arr[j]=value;
        }
        return arr; }
    //============================================================
   // Aşağıdaki search metotu Arrays.binarySearch() yerine geçer
    static int search(int [] arr,int value){
        for (int i =0;i<arr.length;i++){
            if (arr[i]==value){
                return i;
            }
        }
        return -1;
    } //============================================================
    // CopyofArrays metodu . Arrays.copyOfRange() Metodu yerine geçer
    static int [] copyofArrays(int [] arrays, int range){
        int [] arr2= new int[range];
        for (int i =0 ; i<range;i++){
            arr2[i]=arrays[i];

        }
        return arr2;
    }//============================================================
    //equals metodu Arrays.equals() metodu yerine geçer.
    static boolean equals(int [] l1,int [] l2){
        if (l1.length!=l2.length){
            return false;
        }else {
            for (int i=0;i<l1.length;i++){
                if (l1[i]!=l2[i]){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }



}



