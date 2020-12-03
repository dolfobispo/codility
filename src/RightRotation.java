
public class RightRotation {

    public static void main(String[] args) {

        int A[] = {3, 8, 9, 7, 6};
        int K = 3;
        solution(A,K);
    }
    public static int[] solution(int[] A, int K) {

        int[] result = new int [A.length];
        int indice=0;

        for(int  j = 0 ; j < A.length; j++){
            indice = K % (A.length);
            if(indice + j  < A.length){
                result[indice+j] = A[j];
            }else{
                indice = j + indice - A.length;
                result[indice] = A[j];
            }

        }
        return result;
    }




}
