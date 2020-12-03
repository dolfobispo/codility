import java.util.Stack;

public class Nesting {

    public static void main(String[] args) {

        String S = "(()(())())";
        System.out.println(solution(S));
    }
    public static int solution(String S) {
        Stack<String> stack = new Stack<String>();
        String lastChar="";
        for (int i = 0 ; i  < S.length(); i++){
            if(S.charAt(0)==')'){
                return 0;
            }
            else if(S.charAt(i)=='('){
                stack.push(S.substring(i,i+1));
            }else{
                if(stack.size()==0){
                    return 0;
                }
                lastChar = stack.pop();
                if(!isValid(lastChar.charAt(0),S.charAt(i))){
                    return 0;
                }
            }
        }
        if(stack.size() > 0){
            return 0;
        }
        return 1;
    }
    public static boolean isValid(char last, char next){
        if(last=='(' && next == ')') {
            return true;
        }
        return false;
    }




}
