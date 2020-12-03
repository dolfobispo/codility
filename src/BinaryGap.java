
public class BinaryGap {

    public static void main(String[] args) {
        int N = 1041;
        System.out.println(solution(N));
    }
    public static int solution(int N) {
        int maior = 0;
        boolean gap = false;
        int counter = 0;
        String s= Integer.toBinaryString(N);

        for (int i = 0 ; i  < s.length(); i++){
            if(s.charAt(i) == '1' && !gap){
                gap = true;
            }if(s.charAt(i) == '1' && gap){
                if(counter > maior){
                    maior = counter;
                }
                counter =0;
                gap = false;
            }else{
                counter++;
            }
        }
        return maior;

    }




}
