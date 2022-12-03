import java.util.PriorityQueue;
import java.util.Scanner;

public class jq23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        priorityQ Q = new priorityQ();
        System.out.println("Queue is empty : " + Q.isEmpty());
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            Q.Insert(sc.nextInt());
        }
        System.out.println("Elements are ");
        Q.display();
        Q.remove();
        System.out.println("After removing the  elements are : ");
        Q.display();
        System.out.println("Min of the elements is  : " + Q.Peek());
        Q.remove();
        Q.display();
        System.out.println("the size of the Queue is " + Q.size());
        System.out.println("Queue is empty : " + Q.isEmpty());
        sc.close();
    }
}

class priorityQ {
    PriorityQueue<Integer> q = new PriorityQueue<>();

    void Insert(int element) {
        q.add(element);
    }

    int remove() {
        return q.poll();
    }

    void display() {
        for (Integer integer : q) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    boolean isEmpty() {
        return q.isEmpty();
    }

    int size() {
        return q.size();
    }

    int Peek() {
        return q.peek();
    }
}
