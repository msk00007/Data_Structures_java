import java.util.Scanner;
public class test7 {
static class queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        queue(int n){
            arr = new int[n];
            size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return rear == size-1;
        }
        public static void enque(int element){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=element;
        }
        public static int deque(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i< rear;i++){
                arr[i]= arr[i+1];
            }
            rear--;
            return front;
        }
        
        public static void display(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return ;
            }
            for(int i = 0; i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the Queue");
        int n =sc.nextInt();
        if(n>0){
        queue Q = new queue(n);
        if(Q.isEmpty())
        {
        System.out.println("yes Queue is empty...");
        }
        else{
            System.out.println("Queue is not empty");
        }
        for(int i = 0; i<(n/2);i++){
            Q.enque(sc.nextInt());
        }
        Q.display();
        Q.isFull();
        Q.enque(99);
        Q.enque(9);
        System.out.println("deleted peek element is "+Q.deque());
        Q.enque(99123);
        Q.display();
            if(Q.isEmpty())
    {
    System.out.println("yes Queue is empty...");
    }
    else{
        System.out.println("Queue is not empty");
    }
    sc.close();
}
else{  System.out.println("enter valid postive num ");
sc.close();
return;
 };
    }
}
