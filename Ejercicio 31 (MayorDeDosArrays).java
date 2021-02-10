public class Excercise {
    public static int[] highers(int[] a1, int[] a2, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++){
            if (a1[i] > a2[i]){
                res[i] = a1[i];
            } else {
                res [i] = a2[i];
            }
        }
    return res;    
    }
}