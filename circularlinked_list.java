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

public  void insert_at_end( int element){
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
public void insert_at_first(int element){
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
public void insert_after(int position,int element){
    if(head==null){
        System.out.println("list is empty create list first...");
        return;
    }
    node new_node= new node(element);
    if(head.data==position && last!=null){
        new_node.next=last;
        head.next=new_node;
    }
    else if(last.data==position){
        new_node.next=last.next;
        last.next=new_node;
        last=last.next;
    }
    else{
        node itr = head;
        while(itr.data!=position && itr.next!=last.next){
            itr=itr.next;
        }
        if(itr.next==last.next){
            System.out.println("item is not found ");
            return;
        }
        else if(itr.data==position){
            new_node.next=itr.next;
            itr.next=new_node;
        }

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
        // System.out.println("enter element");
        // for(int i =0;i<5;i++){
        // int element = sc.nextInt();
        // l.insert_at_first(element);
        // }
        l.insert_at_first(1);
        System.out.println(l.head.data);
        System.out.println(l.last.data );
        // l.insert_at_end(6);
        // l.insert_at_end(7);
        // l.insert_at_end(8);
        // l.insert_at_end(9);
        // l.insert_at_end(10);
        // l.insert_at_end(11);
        circularlinked_list.printlist(l);//printing the linked list.....
        System.out.println("\n\n");
        // l.delete(l.head,9);//middle element.........
        // l.delete(l.head,11);//last element..........
        // l.delete(l.head,1);// first element.........
        // l.delete(l.head,45);//element which is not in the list...
        boolean flag = true;
        // while(flag){
        //     System.out.println("\n enter the element to be deleted");
        //     int element=sc.nextInt();
        //     l.delete(l.head, element);
        //     System.out.println("to repeat press 1");
        //     int check = sc.nextInt();
        //     if(check!=1){
        //         flag=false;
        //     }
        // }

        while(flag){
            System.out.println("\n enter the element position and element to be inserted");
            int position = sc.nextInt();
            int element=sc.nextInt();
            l.insert_after(position, element);
            circularlinked_list.printlist(l);//printing the linked list.....
            System.out.println("to repeat press 1");
            int check = sc.nextInt();
            if(check!=1){
                flag=false;
            }
        }

        // circularlinked_list.printlist(l);//printing the linked list.....


        sc.close();
    }
}
