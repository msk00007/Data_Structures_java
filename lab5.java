import java.util.*;
public class lab5 {

    public static void main(String[] args){
        stack S = new stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range..");
        int n = sc.nextInt();
        for (int i = 0; i<n;i++){
           int element = sc.nextInt();
            S.push(element);
        }
       
        S.pop();
    
        S.revprint(S.head);
    }

    
}
 class stack{
node head = null;
node tail = null;
public class node{
    int info;
    node next;
    node(int elem){
        info=elem;
        next=null;
    }
}
public boolean isEmpty(){
    if(head == null){
        return true;
    }
    return false;
}
public void push(int element){
    if(head==null){
        node new_node = new node(element);
        head= new_node;
        tail= new_node;
        return;
    }
    if(head!=null){
        if(head==tail){
            node new_node= new node(element);
            head.next=new_node;
            tail=new_node;
        }
        else{
            
            node new_node= new node(element);
            tail.next=new_node;
            tail=tail.next;
        }
    }
}
public void pop(){
    if(isEmpty()){
        System.out.println("list is empty cannot perform pop");
        return;
    }
    if(head==tail){
        head= null;
        tail=null;
        return;
    }
    else{
        node itr = head;
        while(itr.next!=tail){
            itr=itr.next;
        }
        itr.next=null;
        tail=itr;
    }
}

public void revprint(node head){
    
    if(head==null){ 
        return;
    }
    revprint(head.next);
    if(head==this.head){
        System.out.println(head.info);
    }
    else{
    System.out.print(head.info+"-->");
    }

}
}
