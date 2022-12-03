import java.util.Scanner;

public class jq24 {
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

    public static boolean NRsearch(node root, int key) {
        while (root != null) {
            if (root.data == key) {
                return true;
            } else if (root.data > key) {
                root = root.left;
            } else if (root.data < key) {
                root = root.right;
            }
        }
        return false;
    }

public static node deleteRec(node root, int key) {
        if (root == null)
            return root;
        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    static int minValue(node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // this is additional no require in this program i just used check the order of this bst is correct or not
     public static void InOrder(node root){
         if(root == null){
             return;
         }
         InOrder(root.left);
         System.out.print(root.data+" ");
         InOrder(root.right);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node Root = null;
        System.out.println("Enter range :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Root = insert(Root, sc.nextInt());
        }
        InOrder(Root);
        System.out.println();
        System.out.println("Enter the key for search");
        int key = sc.nextInt();
        // search using non recursive function....
        boolean res2 = NRsearch(Root, key);
        System.out.println("search using non recursive function.............");
        if (res2) {
            System.out.println("key is found ");
        } else {
            System.out.println("key is not found");
        }
        System.out.println("Enter element to be deleted");
        key = sc.nextInt();
        Root = deleteRec(Root, key);
        InOrder(Root);
        System.out.println();
        sc.close();

    }
}