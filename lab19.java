public class lab19 {
public static void main(String[] args) {
    Stackclass S = new Stackclass();
    S.isEmpty();
    S.push(5);
    S.push(56);
    S.push(567);
    S.push(4);
    S.display();
    System.out.println("\n"+S.pop());
    S.display();
    S.isEmpty();
}   
}
class Stackclass{
    node head = null;
    node top = null;
    public class node{
        int data;
        node next;
        node prev;
        node(int element){
            data = element;
            next = null;
            prev = null;
        }
    }

    public void push(int element){
        if(head == null){
            head = new node(element);
            top = head;
            return;
        }
        node new_node = new node(element);
        new_node.prev = top;
        top.next = new_node;
        top = top.next;
    }
    public int pop(){
        if(head == null){
            System.out.println("list is empty");
            return -1;
            }
            int delelem = top.data;
            top.prev.next = top.next;
            return  delelem;
        }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void display(){
        if(head == null){
            System.out.println("list is empty cannot display");
            return;
        }
        stackdisplay(head);
        System.out.println();
    }
    public void stackdisplay(node start){
        if(start == null){
            return;
        }
        stackdisplay(start.next);
        System.out.print(start.data+" ");
    }
}
