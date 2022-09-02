import java.util.*;
public class lab24{

    public static void main(String[] args) {
        System.out.println("Enter the size of the queue");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        circularQueue Q = new circularQueue(N);
        System.out.println("Queue is full "+Q.isFull());
        System.out.println("Queue is empty : "+ Q.isEmpty());
        
        Q.enque(4);
        Q.enque(45);
        Q.enque(456);
        Q.display();
        Q.enque(5);
        System.out.println("the deleded element is "+Q.deque());
        Q.display();
        System.out.println("Queue is full "+Q.isFull());
        Q.enque(7);
        Q.display();
        System.out.println("the deleded element is "+Q.deque());
        Q.enque(100);
        Q.display();
        System.out.println("Queue is full "+Q.isFull());
        sc.close();


    }


}
class circularQueue{
    int size;
    int front= -1;
    int rear = -1;
    // int peek;
    int[] arr;
    circularQueue(int element){
        size = element;
        arr = new int[size];
    }
    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(rear == arr.length-1 && front == 0){
            return true;
        }
        else if( rear+1 == front){
            return true;
        }
        return false;
    }

    public void enque(int element){
        if(isFull()){
        System.out.println("queue is full cannot insert the element "+element);
            return;
        }
        if (isEmpty()){
            arr[++front]=element;
            rear++;
            return;
        }
        rear++;
        if(rear>arr.length-1){
            rear = 0;
            arr[rear]=element;
        }
        else{
            arr[rear]=element;
        }
    }
    public int deque(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if(front+1 > arr.length){
            int delelem = arr[front];
            front = 0;
            return delelem;
        }
            int delelem = arr[front];
            front++;
            return delelem;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("list is empty cannot display");
        }
        int i = front;
        while(i!=rear){
            System.out.print(arr[i]+" ");
            if(++i == arr.length){
                i = 0;
            }
        }
        System.out.print(arr[rear]);
        System.out.println();
    }
}