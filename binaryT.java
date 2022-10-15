import java.util.*;
public class binaryT {
    static class Node
    {
        public int data;
        public Node ls;
        public Node rs;
    }
    static Scanner s=new Scanner(System.in);
        public static Node construct(Node r)
        {
            System.out.println("ENter element");
            int ele=s.nextInt();
            if (ele != -1)
            {
                r=new Node();
                r.data=ele;
                r.ls =construct(r.ls);
                r.rs =construct(r.rs);
            }
            else{
                r=null;
            }
            return r;
        }
        public static void preorder(Node r)
        {
            if(r==null){
                return;
            }
            System.out.print(r.data+" ");
            preorder(r.ls);
            preorder(r.rs);
        }
        public static void inorder(Node r)
        {
            if(r==null){
                return;
            }
            inorder(r.ls);
            System.out.print(r.data+" ");
            inorder(r.rs);
        }
        public static void postorder(Node r)
        {
            if(r==null){
                return;
            }
            postorder(r.ls);
            postorder(r.rs);
            System.out.print(r.data+" ");
        }
        public static void main(String args[])
        {
            Node r=null;
           r = construct(r);
           System.out.println("\nThe inorder of the given bst is \n");
            inorder(r);
           System.out.println("\nThe preorder of the given bst is \n");
            preorder(r);
           System.out.println("\nThe postorder of the given bst is \n");
            postorder(r);
        }
}
