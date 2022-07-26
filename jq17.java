import java.util.ArrayList;
import java.util.*;

public class jq17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackarray s = new stackarray();
        while (true) {
            System.out.println("Enter your number");
            try {
                int e = sc.nextInt();
                s.push(e);
            } catch (InputMismatchException e) {
                break;
            }
        }
        System.out.println(s.IsEmpty());
        s.stack_display();
        s.pop();
        s.stack_display();
        System.out.println(s.IsEmpty());
        sc.close();

    }
}

class stackarray extends ArrayList {
    int top = -1;
    ArrayList<Integer> myarr = new ArrayList<Integer>();

    void push(int element) {
        myarr.add(++top, element);
    }

    boolean IsEmpty() {
        return myarr.isEmpty();
    }

    int pop() {
        if (!IsEmpty()) {
            int element = myarr.get(top);
            myarr.remove(top);
            top -= 1;
            return element;
        }
        return -1;
    }

    int peek() {
        if (!IsEmpty()) {
            return myarr.get(top);
        }
        return -1;
    }

    void stack_display() {
        if (IsEmpty()) {
            System.out.println("stack is empty...");
            return;
        }
        int itr = top;
        while (itr >= 0) {
            System.out.print(myarr.get(itr) + " ");
            itr--;
        }
        System.out.println();
    }
}
