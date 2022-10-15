public class Bst {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public  static node insert(node root, int data){
        if(root == null){
            node new_node = new node(data);
            root = new_node;
            return root;
        }
        else if(root.data>data){
            root.left = insert(root.left,data);
        }else if(root.data<data){
            root.right = insert(root.right,data);
        }
        return root;         
    }
    public static void InOrder(node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    public static void PreOrder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void PostOrder(node root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        node Root = null; 
        Root = insert(Root, 4);
        Root = insert(Root, 5);
        Root = insert(Root, 2);
        Root = insert(Root, 1);
        Root = insert(Root, 3);
        System.out.println("\nInOrder of the given Bst is ");
        InOrder(Root);
        System.out.println("\nPreOrder of the given Bst is ");
        PreOrder(Root);
        System.out.println("\nPostOrder of the given Bst is ");
        PostOrder(Root);
    }
}
