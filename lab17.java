public class lab17 {
    
    public static void main(String[] args) {
    deque Q = new deque();
    Q.isEmpty();
    Q.enqueFirst(5);
    Q.enqueFirst(55);
    Q.enqueLast(54);
    Q.enqueLast(69);
    Q.display();
    Q.dequeFirst();
    Q.dequeLast();
    Q.display();
    }
}
class deque{
    node head = null;
    node rear = null;
    public class node{
        int data;
        node next;
        node(int element){
            data = element;
            next = null;
        }
    }

    public void enqueLast(int element){
        if(head == null){
            head = new node(element);
            rear = head;
            return;
        }
        node new_node = new node(element);
        rear.next = new_node;
        rear = rear.next;
    }
    public void enqueFirst(int element){
        if(head == null){
            head = new node(element);
            rear = head;
            return;
        }
        node new_node = new node(element);
        new_node.next = head;
        head = new_node;
    }

    public int dequeLast(){
        if(head == null){
            System.out.println("list is empty");
            return -1;
            }
            if(head == rear){
                int delelem = rear.data;
                rear = null;
                head = null;
                return delelem;
            }
            int delelem = rear.data;
            node itr = head;
            while(itr.next != rear){
                itr = itr.next;
            }
            itr.next = null;
            rear = itr;
            return  delelem;
        }
    public int dequeFirst(){
        if(head == null){
            System.out.println("list is empty");
            return -1;
        }
        if(head == rear){
            int delelem = head.data;
            head = null;
            rear = null;
            return delelem;
        }
            
            int delelem = head.data;
            head = head.next;
        return delelem;
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
        node itr = head;
        while(itr!= rear.next){
            System.out.print(itr.data+" ");
            itr = itr.next;
        }
        System.out.println();
    }
}
