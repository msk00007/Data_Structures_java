public class lab13 {
    node head = null;
    node rear = null;
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

    public void insert(int element){
        if(head == null){
            head = new node(element);
            rear = head;
            return;
        }
        node new_node = new node(element);
        new_node.prev = rear;
        rear.next = new_node;
        rear = rear.next;
    }
    public void delete(int poselement){
        if(head == null){
            System.out.println("list is empty");
            return;
        }else if( head.data == poselement){
            if(head == rear){
            head = null;
            rear = null;
            }
            else{
                head = head.next;
            }
        }
        node itr = head;
        while(itr!=rear.next && itr.data != poselement){
            itr = itr.next;
        }
        if(itr == rear.next){
            System.out.println("element not found ...");
            return ;
        }
        if(itr.data == poselement){
            if(itr == rear){
                rear.prev.next = rear.next;
            }
            else{
                itr.next.prev = itr.prev;
                itr.prev.next = itr.next;
            }
        }
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

    public static void main(String[] args) {
        lab13 doubly = new lab13();
        doubly.insert(2);
        doubly.insert(23);
        doubly.insert(234);
        doubly.insert(2345);
        doubly.display();
        doubly.delete(9);
        doubly.display();
    }
}
