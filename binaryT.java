import java.util.*;
public class binaryT {
 static class Node
    {
         int data;
         Node left;
         Node right;
    }
    static Scanner sc=new Scanner(System.in);
        public static Node construct(Node r)
        {
            System.out.println("Enter element");
            int ele=sc.nextInt();
            if (ele != -1)
            {
                r=new Node();
                r.data=ele;
                r.left =construct(r.left);
                r.right =construct(r.right);
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
            preorder(r.left);
            preorder(r.right);
        }
        public static void inorder(Node r)
        {
            if(r==null){
                return;
            }
            inorder(r.left);
            System.out.print(r.data+" ");
            inorder(r.right);
        }
        public static void postorder(Node r)
        {
            if(r==null){
                return;
            }
            postorder(r.left);
            postorder(r.right);
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
