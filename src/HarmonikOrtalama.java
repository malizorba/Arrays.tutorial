public class HarmonikOrtalama {
    public static void main(String[] args) {
        int[] list1 = {1,2,3};
        System.out.println("Harmonic ortalama =  " + valueHarmonic(list1));

    }

    static double valueHarmonic(int[] array) {
        double result = 0 ;
        for(int i : array) {
            result += ( 1.0 / i ) ;
        }
        return  array.length/result;
    }


}


