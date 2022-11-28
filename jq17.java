import java.util.*;
public class jq17 {
public static void main(String[] args) {
    System.out.println("Enter stack size");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    stackarray s = new stackarray(size);
    queuearray q = new queuearray(size);
    System.out.println("is stack is empty : "+s.isEmpty());
    System.out.println("Enter elements");
    while(!s.isFull()){
    s.push(sc.nextInt());
    }
    while(!s.isEmpty()){
        int element = s.peek();
        System.out.print(s.pop()+" ");
        q.enque(element);
    }
    System.out.println("\n stak is full ? : "+s.isFull());
    q.queue_display();
    sc.close();
}
    
}
class stackarray{
    int size;
    int top=-1;
    ArrayList<Integer> myarr;
    stackarray(int size){
    this.size = size;
    this.myarr = new ArrayList<Integer>(size);
    }
    void push(int element){
        if(!isFull()){
        myarr.add(++top,element);
        return;
        }
        System.out.println("stack is full");
        return;
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        if((top+1)==size){
            return true;
        }
        return false;
    }
    int pop(){
        if(!isEmpty()){
            int element = myarr.get(top);
            top-=1;
            return element;
        }
        return -1;
    }
    int peek(){
        if(!isEmpty()){
            return myarr.get(top);
        }
        return -1;
    }
    void stack_display(){
        if(!isEmpty()){
        while(!isEmpty()){
            System.out.print(myarr.get(top)+" ");
            top--;
        }
        System.out.println();
        return;
        }
        System.out.println("stack is empty...");
    }
}

class queuearray{
    int size;
    int rear=-1;
    ArrayList<Integer> myarr;
    queuearray(int size){
    this.size = size;
    this.myarr = new ArrayList<Integer>(size);
    }
    void enque(int element){
        if(!isFull()){
        myarr.add(++rear,element);
        return;
        }
        System.out.println("stack is full");
        return;
    }
    boolean isEmpty(){
        return rear == -1;
    }
    boolean isFull(){
        if((rear+1)==size){
            return true;
        }
        return false;
    }
    int pop(){
        if(!isEmpty()){
            int element = myarr.get(0);
            rear-=1;
            return element;
        }
        return -1;
    }
    int peek(){
        if(!isEmpty()){
            return myarr.get(rear);
        }
        return -1;
    }
    void queue_display(){
        if(!isEmpty()){
        System.out.println("Queue elements are"+myarr);
    
        return;
        }
        System.out.println("stack is empty...");
    }
}