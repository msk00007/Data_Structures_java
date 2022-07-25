import java.util.*;
public class doubleLinkedList {
    node head;
// class node-------------------------------------------------------
    public class node {
        int info;
        node rptr;
        node lptr;
        node(int x){
         info=x;
         rptr = null;
         lptr = null;
        }
    }
//-----------------------Search code-------------------------
public  node L_search(node l,int key){
    node newnode = l;
    if(newnode==null){
        return head;
    }
    int x = key;
    while(newnode!=null){
    if(newnode.info==x){
        return newnode;
    }
    else{
        newnode=newnode.rptr;
    }
}
    return null;
}
//-----------------------delete code----------------------------
public void delete( node position){
    node start = head;
if(start==null){
    System.out.println("Delete------>the list is empty");
    return;
}else if(start==position){
    start=start.rptr;
    head=start;
    return;
}
node current=start;
while(current != null && current != position){
    current = current.rptr;
}
if(current==null){
    System.out.println("location is not found");  
    return;
}
else if(current == position){
    if(current.rptr==null){
        current.lptr.rptr=null;
    }else{
        current.lptr.rptr=current.rptr;
        current.rptr.lptr=current.lptr;    
    }
}
}
//-----------------------append code----------------------------
 void append(int x){
    
    node t = new node(x);
        if(head==null){
        head=t;
     }
     else{
        node temp = head;
        while(temp.rptr!=null){
            temp=temp.rptr;
        }
        t.lptr=temp;
        temp.rptr=t;
        temp=temp.rptr;
     }
    
    
        
}
//------------------------push code------------------------------
public void front(int x){
    node new_node = new node(x);
        if(head==null){
        head=new_node;
    }else{
        head.lptr=new_node;
        new_node.rptr=head;
        head=new_node;
    }
}
//------------------------print list code------------------------------
 void printlist(){
    node f = head;
   if(f==null){
    System.out.println("list is empty");
    return;
   }
    while(f!=null){
        System.out.print(f.info+"-->");
        f=f.rptr;
    }
}
//------------------------insertion after code-----------------------------
void insert_after(int pos, int new_elem){
node new_node = new node(new_elem);
if(head==null){
    System.out.println("list is empty choose push or append");
    return;
}
node location =L_search(head,pos);
if(location==null){
    System.out.println("element you want to insert_before is not in the list");
    return;
}else{
     if(location.rptr==null){
        location.rptr = new_node;
        new_node.lptr=location;
     }
     else{
       new_node.lptr=location;
       new_node.rptr=location.rptr;
       location.rptr=new_node;
       new_node.rptr.lptr=new_node;
     }
}

}

//--------------------------------insert_before code--------------------------------
void insert_before(int pos, int new_elem){
    node new_node = new node(new_elem);
    node temp = head;
    if(temp==null){
        System.out.println("list is empty so choose push or append");
        return;
    }else if(temp.info==pos){
        new_node.rptr=temp;
        temp.lptr=new_node;
        head=new_node;
    }
    else{
      
        while(temp!=null&& temp.info!=pos ){
             temp=temp.rptr;
        }
        if(temp==null){
            System.out.println("element position you entered is not found :");
            return;
        }else{
            new_node.rptr=temp;
            new_node.lptr=temp.lptr;
            temp.lptr.rptr=new_node;
            temp.lptr=new_node;
            
        }


    }


}

//-------------------------MAIN code-----------------------------------
public static void main(String[] args) {
     doubleLinkedList list= new doubleLinkedList();
     Scanner sc = new Scanner(System.in);
    //===============================switch_Cases=====================================
  System.out.println("Enter which operation you want to perform:");
  System.out.println("1.insert at start..2-insert at the end..3-insert after an element");
  System.out.println("4-search \n 5-delete an element..6-insert before..7.printlist .0-exit");  
   boolean flag=true;
    while(flag){
        System.out.println("\n enter your option");
        int  option=sc.nextInt();
        switch(option){
        case 1://Insert at the begining............
        System.out.println("enter the number");
        int num=sc.nextInt();
        list.front(num);
        break;
        case 2:// Insert at the end.................
        System.out.println("\n enter the number");
        int num2=sc.nextInt();
        list.append(num2);
        break;
        case 3://Insert after an element.............
        System.out.println("enter the element to be insert");
        int e=sc.nextInt();
        System.out.println("enter the postion element ");
        int p=sc.nextInt();
        list.insert_after(p,e);
        break;
        case 4://Search...............................
        System.out.print("enter the element to be searched--");
        int keyy=sc.nextInt();
        node r = list.L_search(list.head,keyy);
        if(r==list.head){
            System.out.println("Search---->>>list is empty....");
        }else if(r!=null){
            System.out.println("Search---->>>location found"+r);
        }else{
            System.out.println("Search---->>>location not found");
        }
        break;
        case 5:// Delete.................................
        System.out.println("enter the element to be deleted....");
        int del_elem=sc.nextInt();
        node del_pos=list.L_search(list.head,del_elem);
        list.delete(del_pos );
        break;
        case 6://Insert before an element.................
        System.out.println("enter the elemet to be inserted");
        num = sc.nextInt();
        System.out.println("enter the position element...");
        p=sc.nextInt();
        list.insert_before(p, num);
        break;
        case 7:// Print the list ...............................
        list.printlist();
        break;
        case 0:// Exit........................................
        flag=false;
        break;

        default: //Default code for wrong entry...................
        System.out.println("enter correct option");
        option=sc.nextInt();
        break;
    }
}
    sc.close();
}
}