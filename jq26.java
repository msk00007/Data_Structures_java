import java.util.Scanner;

public class jq26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the circular Queue : ");
		int n = sc.nextInt();
		circularQueue C = new circularQueue(n);
        System.out.println("Queue is empty : "+C.isEmpty());
        System.out.println("Enter elements: ");
        for(int i = 0; i<n;i++){
            C.enqueue(sc.nextInt());
        }
		C.enqueue(9);
		C.display();
		C.dequeue();
		C.dequeue();
		System.out.println("Is queue empty ? --> "+C.isEmpty());
		C.enqueue(9);
		System.out.println("Is queue full ? --> "+C.isFull());
		C.display();
        System.out.println("after adding element 10");
		C.enqueue(10);
		C.display();
        sc.close();
	}
}
class circularQueue{
	int SIZE;// SIZE  will be constant throught the program
	int front,rear;
	int arr[];
	circularQueue(int size){
		SIZE = size;
		front = -1;
		rear = -1;
		arr = new int[SIZE];
	}
	public boolean isFull() {
		if (front == 0 && rear == SIZE - 1) return true;
		if(front == rear+1) return true;
		return false;
	}
	public boolean isEmpty(){
		if(front == -1) return true;
		else return false;
	}
	public void enqueue(int elem) {
		if(isFull()){
			System.out.println("the Queue is full..Cannot insert the element "+elem+" now .");
		}
		else{
			if(front == -1){
				front = 0;
			}
			rear = (rear+1)%SIZE;
			arr[rear] = elem;
		}
	}
	public int dequeue() {
		int data;
		if(isEmpty()){
			System.out.println("The Queue is empty..Cannot delete..");
			return -1;
		}
		else{
			data = arr[front];
			if(front == rear)   // if queue contains only one element..
			{  
				front = rear = -1;
			}
			else{
				front = (front+1)%SIZE;
			}
			return data;
		}
	}
	public void display() {
		if(isEmpty()){
			System.out.println("The Queue has no elements....");
			return;
		}
		int i;
		System.out.print("Front ---> { ");
		for(i = front;i!=rear;i = (i+1)%SIZE){
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[i]);
		System.out.println("} ---> Rear.");
	}
}