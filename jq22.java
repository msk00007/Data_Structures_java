import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class jq22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// using Array............................................
        Deque<Integer> d = new ArrayDeque<>();
        System.out.println("d1--enter element at first");
        d.addFirst(sc.nextInt());
        System.out.println(" enter element at first");
        d.addFirst(sc.nextInt());
        System.out.println("enter element at last");
        d.addLast(sc.nextInt());
        System.out.println("the elements are");
        for (Integer integer : d) {
            System.out.print(integer + " ");
        }
        System.out.println();
        d.removeFirst();
        System.out.println("after removing first element the elements are");
        for (Integer integer : d) {
            System.out.print(integer + " ");
        }
        System.out.println();
// using Linkedlist..........................................
        Deque<Integer> d1 = new LinkedList<Integer>();
        System.out.println("d2---enter element at first");
        d1.addFirst(sc.nextInt());
        System.out.println("enter element at last");
        d1.addLast(sc.nextInt());
        System.out.println("enter element at first");
        d1.addFirst(sc.nextInt());
        System.out.println("the elements are");
        for (Integer integer : d1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        d1.removeFirst();
        d1.removeLast();
        System.out.println("after removing first and last elements the elements are");
        for (Integer integer : d1) {
            System.out.print(integer + " ");
        }
        System.out.println();
 // using doublelinkedlist........................................
        dequeadt d3 = new dequeadt();
        System.out.println("d3--enter element at first");
        d3.addFirst(sc.nextInt());
        System.out.println("enter element at first");
        d3.addFirst(sc.nextInt());
        System.out.println("enter element at last");
        d3.addLast(sc.nextInt());
        System.out.println("enter element at last");
        d3.addLast(sc.nextInt());
        System.out.println("The elements are ..........");
        d3.display();
        System.out.println();
        System.out.println("after removing first and last elements the remaining elements are ");
        d3.removFirst();
        d3.removLast();
        d3.display();
        sc.close();
    }
}
// dequeAdt using double linkedlist............................................ 
class dequeadt extends doubleLinkedList {
    void addFirst(int element) {
        front(element);
    }

    void addLast(int element) {
        append(element);
    }

    int removFirst() {
        return removeFirst();
    }

    int removLast() {
        return removeLast();
    }

    void display() {
        printlist();
    }
}
// double linkedlist.................................................
class doubleLinkedList {
    node head;

    // class node-------------------------------------------------------
    public class node {
        int info;
        node rptr;
        node lptr;

        node(int x) {
            info = x;
            rptr = null;
            lptr = null;
        }
    }

    // -----------------------add last code----------------------------
    void append(int x) {

        node t = new node(x);
        if (head == null) {
            head = t;
        } else {
            node temp = head;
            while (temp.rptr != null) {
                temp = temp.rptr;
            }
            t.lptr = temp;
            temp.rptr = t;
            temp = temp.rptr;
        }
    }

    // ------------------------add first code------------------------------
    public void front(int x) {
        node new_node = new node(x);
        if (head == null) {
            head = new_node;
        } else {
            head.lptr = new_node;
            new_node.rptr = head;
            head = new_node;
        }
    }

    // ------------------------print list code------------------------------
    void printlist() {
        node f = head;
        if (f == null) {
            System.out.println("list is empty");
            return;
        }
        while (f != null) {
            System.out.print(f.info + " ");
            f = f.rptr;
        }
    }
    // ------------------------remove first code------------------------------

    int removeFirst() {
        if (head == null) {
            System.out.println("Empty dequeue");
            return -1;
        }
        int element = head.info;
        if (head.rptr == null) {
            head = null;
        } else {
            head = head.rptr;
            head.lptr = null;
        }
        return element;
    }
    // ------------------------remove last code------------------------------

    int removeLast() {
        if (head == null) {
            System.out.println("Empty dequeue");
            return -1;
        }
        node itr = head;
        while (itr.rptr != null) {
            itr = itr.rptr;
        }
        int element = itr.info;
        itr.lptr.rptr = null;
        return element;
    }
}