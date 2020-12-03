import java.util.*;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int [] A= {0,3,3,4,25,25,4,25,2,2,4,4,25};
        System.out.println(solution(A));
    }
    public static int  solution(int [] A) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(A);

        for(int  j = 0 ; j < A.length; j++){

            if(j==0){
                result.add(A[j]);
            }else{
                if(A[j] == A[j-1]) {
                    result.add(A[j]);

                } else if(A[j]!=A[j-1]){
                    if(result.size() % 2 !=0){
                        return result.get(0);
                    }else {
                        result = new ArrayList<>();
                        result.add(A[j]);
                    }
                }
            }
        }
        return result.get(0);
    }



}
