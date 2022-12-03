import java.util.Stack;
import java.util.Scanner;

public class jq27 {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root, int data) {
        if (root == null) {
            node new_node = new node(data);
            root = new_node;
            return root;
        } else if (root.data > data) {
            root.left = insert(root.left, data);
        } else if (root.data < data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void InOrder(node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    // inorder non recursive ....................................
    public static void inorder(node root) {
        if (root == null)
            return;
        Stack<node> s = new Stack<node>();
        node curr = root;

        while (curr != null || s.size() > 0) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    // preorder non recursive....................................

    public static void preorderNonRec(node root) {
        Stack<node> s = new Stack<node>();
        while (true) {
            while (root != null) {
                System.out.print(root.data + " ");
                s.push(root);
                root = root.left;
            }
            if (s.isEmpty()) {
                return;
            }
            root = s.pop();
            root = root.right;
        }
    }

    // preorder recursive ..........................................
    public static void PreOrder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    // postorder non recursive,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,

    public static void postorderNonRec(node root) {
        Stack<node> s1 = new Stack<node>();
        Stack<node> s2 = new Stack<node>();
        s1.push(root);
        while (s1.isEmpty() == false) {
            node temp = s1.pop();
            s2.push(temp);
            if (temp.left != null) {
                s1.push(temp.left);
            }
            if (temp.right != null) {
                s1.push(temp.right);
            }
        }
        while (s2.isEmpty() == false) {
            System.out.print(s2.pop().data+" ");
        }
        System.out.println();
    }

    // postorder recursive,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    public static void PostOrder(node root) {
        if (root == null) {
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node Root = null;
        System.out.println("Enter range :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Root = insert(Root, sc.nextInt());
        }
        System.out.println("\nInOrder of the given Bst is ");
        InOrder(Root);

        System.out.println("\nInOrder non recursive of the given Bst is ");
        inorder(Root);

        System.out.println("\nPreOrder of the given Bst is ");
        PreOrder(Root);
        System.out.println("\nPreOrder non recursive of the given Bst is ");
        preorderNonRec(Root);
        System.out.println("\nPostOrder of the given Bst is ");
        PostOrder(Root);
        System.out.println("\nPostOrder non recursive  of the given Bst is ");
        postorderNonRec(Root);
        sc.close();
    }
}
