public class test6 {
public static void main(String[] args) {
    queue Q = new queue();
    if(Q.isEmpty())
    {
    System.out.println("yes Queue is empty...");
    }
    else{
        System.out.println("Queue is not empty");
    }
    Q.enque(5);
    Q.enque(4);
    Q.enque(25);
    Q.display();
    System.out.println(Q.deque());
    Q.enque(56);
    Q.display();
    if(Q.isEmpty())
    {
    System.out.println("yes Queue is empty...");
    }
    else{
        System.out.println("Queue is not empty");
    }
    System.out.println(Q.peek());
}
}
class queue{
    node Front = null;
    node Rear = null;
    class node{
        int info;
        node next;
        node(int element){
            info = element;
            next = null;
        }
    }
    public boolean isEmpty(){
        if(Front==null){
            return true;
        }
        else return false;
    }
    public  void enque(int element){
        if(Front==null){
            node new_node = new node(element);
            Front = new_node;
            Rear = new_node;
            return;
        }
        else if(Front!= null && Front.next== null){
                node new_node = new node(element);
                Front.next = new_node;
                Rear = Front.next;
            }
            else{
                
             node new_node = new node(element);
            
            Rear.next = new_node;
            Rear = Rear.next;
        }
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }

            int front = Front.info;
             return front;
        }
        public int deque(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = Front.info;
            Front = Front.next;
            return front;
            
        }
        public void display(){
            if(isEmpty()){
                System.out.println("queue is empty..");
                return;
            }
            node itr = Front;
            while(itr!=Rear.next){
                System.out.print(itr.info+" ");
                itr = itr.next;
            }
            System.out.println();
        }
    }
