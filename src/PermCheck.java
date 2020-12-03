import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {

        int A[] = {1,2,3};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 1 ; i  <= A.length; i++){
            if(A[i-1]!=i){
                return 0;
            }
        }
        return 1;
    }




}
