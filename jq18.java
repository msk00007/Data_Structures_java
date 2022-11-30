import java.util.*;

public class jq18 {

    public static int inp_prec(char ns) {
        if (ns == '+' || ns == '-') {
            return 1;
        } else if (ns == '*' || ns == '/') {
            return 3;
        } else if (ns == '^') {
            return 6;
        } else if (ns == '(') {
            return 9;
        } else if (ns == ')') {
            return 0;
        } else {
            return 7;
        }
    }

    public static int stk_prec(char ns) {
        if (ns == '+' || ns == '-') {
            return 2;
        } else if (ns == '*' || ns == '/') {
            return 4;
        } else if (ns == '^') {
            return 5;
        } else if (ns == '(') {
            return 0;
        } else if (ns == ')') {
            return 0;
        } else {
            return 8;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix expression with adding a ')' and '#' at the end-->");
        String infix = sc.next();
        int n = infix.length();
        char postfix[] = new char[n];
        Stack<Character> s = new Stack<Character>();
        s.push('(');
        int i = 0;
        char nextsym = infix.charAt(i);
        int j = 0;
        while (nextsym != '#') {
            while (inp_prec(nextsym) < stk_prec(s.peek())) {
                char temp = s.pop();
                postfix[j] = temp;
                j++;
            }
            if (inp_prec(nextsym) > stk_prec(s.peek())) {
                s.push(nextsym);
            } else {
                char k = s.pop();
            }
            i++;
            nextsym = infix.charAt(i);
        }
        String result = new String(postfix);
        if (s.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println("invalid infix");
        }
        sc.close();
    }
}
