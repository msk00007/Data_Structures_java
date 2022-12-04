import java.util.Scanner;
public class jq34 {
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
    public static int leafnodecount(node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        else{
        return leafnodecount(root.left)+leafnodecount(root.right);
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
    public static void main(String[] args) {
        node Root = null; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range :");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            Root = insert(Root,sc.nextInt());
        }
       System.out.println("leaf node count is :"+leafnodecount(Root));
        sc.close();
}
}