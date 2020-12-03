import java.util.Arrays;

public class Dominator {

    public static void main(String[] args) {

        int A[] = {1,2,1};
        System.out.println(solution(A));
    }
    public static int  solution(int [] A) {

        int dominator = -1;
        int count = 0;
        int[] copy = Arrays.copyOf(A, A.length);
        Arrays.sort(A);
        int max = Integer.MIN_VALUE;
        if(A.length ==0){return -1;}
        if(A.length==1){return 0;}

        for(int  j = 0 ; j < A.length; j++){
            count++;
            if(count > max){
                dominator=A[j];
                max = count;
            }

            if( j < A.length-1 && A[j] != A[j+1]){
                if(count > max){
                    max = count;
                    dominator=A[j+1];
                }
                count =0;
            }

        }

        if(max > (A.length/2)){
            return getIndex(copy,dominator);
        }else{
            return -1;
        }

    }

    public static int getIndex(int[]A, int item){
        for(int i = 0; i < A.length ; i++){
            if (A[i]==item) return i;
        }
        return -1;
    }



}
