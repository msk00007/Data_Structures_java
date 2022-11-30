import java.util.ArrayList;
import java.util.*;

public class jq17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queuearray q = new queuearray();
        System.out.println("Queue is empty : "+q.IsEmpty());
        System.out.println("Enter your number");
        while (true) {
            try {
                int e = sc.nextInt();
                q.enqueue(e);
            } catch (InputMismatchException e) {
                break;
            }
        }
        q.Queue_display();
        q.dequeue();
        q.Queue_display();
        System.out.println("Queue is empty : "+q.IsEmpty());
        sc.close();

    }
}

class queuearray {
    ArrayList<Integer> myarr = new ArrayList<Integer>();

    void enqueue(int element) {
        myarr.add(element);
    }

    boolean IsEmpty() {
        return myarr.isEmpty();
    }

    int dequeue() {
        if (!IsEmpty()) {
            int element = myarr.get(0);
            myarr.remove(0);
            return element;
        }
        return -1;
    }

    int peek() {
        if (!IsEmpty()) {
            return myarr.get(0);
        }
        return -1;
    }

    void Queue_display() {
        if (IsEmpty()) {
            System.out.println("stack is empty...");
            return;
        }
        for (Integer i : myarr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
