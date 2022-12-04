import java.util.*;
public class jq33 {
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
    static void printLevelOrder(Node root)
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    static int  height(Node root)
    {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    static void printCurrentLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
        public static void main(String args[])
        {
            Node r=null;
           r = construct(r);
           printLevelOrder(r);
          
        }
}
