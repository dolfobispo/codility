import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {

        int A[] = {1,2,3};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);

        if( A.length ==1){
            return 1;
        }
        if(A.length == 0){
            return 0;
        }
        int count = 1;
        for(int i = 0; i < A.length ; i++){
            if(i  < A.length-1){
                if(A[i] != A[i+1]){
                    count++;
                }
            }

        }

        return count;

    }




}
