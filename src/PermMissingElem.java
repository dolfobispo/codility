import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {

        int A[] = {2, 3, 1, 5};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i = 1; i <=A.length; i++){
            if(A[i-1] != i){
                return i;
            }
        }
        return A.length ==0 ? 1:A[A.length-1]+1;
    }




}
