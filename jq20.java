import java.util.*;
public class jq20 {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>() ;
        Stack<Character> st = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String s = sc.next();
        for(int i = 0; i<s.length();i++){
            q.add(s.charAt(i));
        }
        String temp = "";
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            temp+=st.pop();
        }
        if(s.compareTo(temp)==0){
            System.out.println("polindrome");
        }else{
            System.out.println("Not polindrome");
        }
        sc.close();
    }
}
