import java.util.Scanner;

public class test3 {
    node head;
    public class node{
        int info;
        node next;
        node(int element){
            info=element;
            next=null;
        }
    }
    public void insert(int element){
        if(head==null){
            node new_node= new node(element);
            head=new_node;
            return;
        }
        if(head!=null){
            node new_node = new node(element);
            if(head.next==null){
                head.next=new_node;
                return;
            }
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
    }
    public void printlist(node start){
        System.out.println();
        node travers = start;
        while(travers!=null){
            System.out.print(travers.info+" ");
            travers=travers.next;
        }
    }
    public void delete(node start,int element){

        if(start==null){
            System.out.println("list is empty!");
            return;
        }
        if(start.info==element){
            if(start.next==null){
                start=null;
                head=start;
            }else{
                start=start.next;
                head=start;
            }
            return;
        }
        node itr = start;
        node prev=itr;
        while(itr.info!=element && itr!=null){
            prev=itr;
            itr=itr.next;
        }
        if(itr==null){
            System.out.println("element is not found");
            return;
        }
        if(itr.info==element){
            if(itr.next==null){
                prev.next=null;
            }
            else{
                prev.next=itr.next;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        test3 l = new test3();
        // l.insert(3);
        // l.insert(4);
        // l.insert(5);
        // l.insert(6);
        // l.insert(9);
        // l.insert(10);
        // l.insert(11);
        l.printlist(l.head);
        System.out.println("\n enter the element to be deleted");
        int key = sc.nextInt();
        l.delete(l.head, key);
        l.printlist(l.head);
        sc.close();

        
    }
}
