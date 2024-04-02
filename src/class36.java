import java.util.ArrayList;

class Solution{
    static int maximumSumSubarray(int k, ArrayList<Integer> Arr, int N){
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i <= N; i++){
        //     int sum = 0;
        //     for(int j=0; j<k; j++){
        //         sum += Arr.get(i+j);
        //     }
        //     if(sum>max) max = sum;
        // }
        // return max;

            int sum = 0;
            for(int i=0; i<k; i++){
                sum += Arr.get(i);
            }
            int max = sum;
            for(int i=0; i<N-k; i++){
                sum -= Arr.get(i) + Arr.get(i+k);
                if(sum>max) max = sum;
            }
            return max;
    }
}

public class class36 {
    public static void main(String[] args) {
        
    }
}
