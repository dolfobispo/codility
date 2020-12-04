

public class MaxCounters {

    public static void main(String[] args) {

        int A[] = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int [] result = solution(A,N);
        for ( int i = 0 ; i < result.length ; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] solution(int[] A, int N) {

        int[] result = new int [N];
        int maxCounter = 0;
        int maxCounterOnChange = 0;

        for(int  j = 0 ; j < A.length; j++){
            if(A[j] == N+1){
                maxCounterOnChange = maxCounter;
            }else{
                if(result[A[j]-1] < maxCounterOnChange){
                    result[A[j]-1] = maxCounterOnChange + 1;
                }else {
                    result[A[j] - 1]++;
                }
                if(result[A[j]-1] > maxCounter){
                    maxCounter = result[A[j]-1];
                }
            }
        }
        for(int i=0;i<N;i++){
            if(result[i] < maxCounterOnChange){
                result[i] =  maxCounterOnChange;
            }
        }

        return result;

    }

}

