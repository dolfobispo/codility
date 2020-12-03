import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {

        int A[] = {-1,-2,1,2};
        System.out.println(solution(A));
    }
    public static int  solution(int [] A) {
        Arrays.sort(A);
        int smallest = 1;
        for(int i = 0; i < A.length ; i++){
            if(A[i] <= 0){
                smallest = 1;
            }
            else if(i < A.length-1){

                if(A[i] - smallest >= 1){
                    return smallest;
                }
                if(A[i+1] - A[i] >1){
                    return A[i] +1;
                }else if(A[i+1] - A[i]==1){
                    smallest =A[i+1];
                }
            }else{
                if(A[i] - smallest >=1){
                    return smallest;
                }
                return A[i] +1;
            }
        }

        return smallest;

    }




}
