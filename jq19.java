import java.util.Scanner;
import java.util.Stack;
public class jq19 {

    public static int check(char ns) {
        if (ns == '(') {
            return 5;
        } else if (ns == ')') {
            return 4;
        } else if (ns == '{') {
            return 8;
        } else if (ns == '}') {
            return 7;
        } else if(ns == '<'){
            return 11;
        }
        else if(ns == '>'){
            return 10;
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        Stack<Character> st=  new Stack<>();
        boolean flag = false;
        for(int i = 0; i<s.length(); i++){
            if(check(s.charAt(i))==1){
                continue;
            }
            if(st.isEmpty()){
                flag= true;
                st.push(s.charAt(i));
             }
             else{
            if(check(s.charAt(i))+1==(check(st.peek()))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        }
        System.out.println(st);
        if(flag){
        if(st.isEmpty()){
            System.out.println("matched correctly");
        }
        else{
            System.out.println("missmatch");
        }
    }else{
        System.out.println("no parenthesys are used");
    }
        sc.close();
    }
}
