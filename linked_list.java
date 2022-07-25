import java.util.*;


public class linked_list {
    node head;
    linked_list(){
     head=null;
    }
    static class node {
        String info;
        node next =null;
        node(String x){
         info=x;
         next=null;
        }
    }

public static node L_search(node l,String key){
    node newnode = l;
    String x = key;
    while(newnode!=null){
    if((newnode.info).compareTo(x)==0){
        return newnode;
    }
    else{
        newnode=newnode.next;
    }
}
    return null;
}

public static void delete(node l, node position){
if(l==null){
    System.out.println("the list is empty");
    return;
}else if(l==position){
    l=l.next;
    return;
}
node prev = null;
node current = l;
while(current != null && current != position){
    prev = current;
    current = current.next;
}
if(current==null){
    System.out.println("location is not found");  
}
else if(current == position){
        prev.next=current.next;     
}
}

public static void printlist(node l){
    node f = l;
   
    while(f!=null){
        // System.out.println(f.next);
        System.out.print(f.info+"-->");
        f=f.next;
    }
}




public static void main(String[] args) {
    linked_list l= new linked_list();

    linked_list p = new linked_list();
    
    System.out.println("Enter the eliment and after giving input press $ and enter");
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    String check = "$";
    if(x.equals(check)){
        System.out.println("list is empty");
        sc.close();
        return;
    }
    else{
        while(x.compareTo("$")!=0){
            node t = new node(x);
            if(l.head==null){
                l.head=t;
                p.head=t;
            
            }
            else{
                if(l.head!=null){
                    p.head.next=t;
                    p.head=p.head.next;
                }
                
            }
                System.out.println("Enter the eliment and after giving input press $ and enter");
                x=sc.next();
        }
    }
    

    System.out.println("Enter the key to search");
    String key = sc.next();
    // System.out.println(l.head);
    printlist(l.head);
    node result = L_search(l.head,key);
    System.out.println(result);
    if(result!=null){
    System.out.println("The element you sesrched is : "+result.info);
    }else{
        System.out.println("element is not found");
    }
    delete(l.head,result);
    printlist(l.head);
    sc.close();
}
    


}