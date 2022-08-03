import java.util.*;
public class circularlinked_list {
    node head;
    node last;
    public class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
    }

public  void insert( int element){
    if(head==null){
        node new_node= new node(element);
        head=new_node;
        new_node.next=head;
        last=new_node;
    }
    else if (last!=null){
        node new_node = new node(element);
        new_node.next=head;
        last.next = new_node;
        last=last.next;
    }
}
public void insertfirst(int element){
    if(head==null){
        node new_node= new node(element);
        head=new_node;
        new_node.next=head;
        last=new_node;
    }else{
        node new_node = new node(element);
        new_node.next=head;
        head=new_node;
    }
}
public void delete(node start,int element){
        if(start==null){
            System.out.println("list is empty");
            return;
        }else{
            if(start.data==element){
                start=start.next;
                head=start;
                last.next=head;
                return;
            }
          else{
                node itr = start;
                node prev=null;
            do{
                prev=itr;
            itr=itr.next;
            }while(itr.data!=element && itr!=last.next );
            if(itr==last.next){
                System.out.println("element not found");
                return;
            }else{
                if(itr.next==head){
                    prev.next=head;
                    last=prev;
                }
                else{
                    prev.next=itr.next;
                }
            }
        }
        }
}
public static void printlist(circularlinked_list l){
            if(l.head==null){
                System.out.println("list is empty");
            return;
            }
            node itr = l.head;
            do{
            System.out.print(itr.data+" ");
            itr=itr.next;
            }
           while(itr!=l.last.next);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        circularlinked_list l = new circularlinked_list();
        System.out.println("enter element");
        for(int i =0;i<5;i++){
        int element = sc.nextInt();
        l.insertfirst(element);
        }
        l.insert(6);
        l.insert(7);
        l.insert(8);
        l.insert(9);
        l.insert(10);
        l.insert(11);
        circularlinked_list.printlist(l);
        System.out.println("\n\n");
        l.delete(l.head,9);
        l.delete(l.head,11);
        l.delete(l.head,1);
        l.delete(l.head,45);
        circularlinked_list.printlist(l);

        System.out.println( "\n"+ l.last.next.data);
        sc.close();

    }
}
