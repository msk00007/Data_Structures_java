import java.util.Scanner;

public class BstNr {
    static class node{
        int data ;
        node left,right;
        node(int data){
            this.data = data;
            this.left=null;
            this.right = null;
        }
    }
    public static node insert(node root, int data){
        if(root == null){
            root = new node(data);
            return root;
        }
        else  {
            node prev=null;
            node temp = root;
        while(temp!=null){
            if(temp.data>data){
                prev = temp;
                temp = temp.left;
            }
            else if (temp.data<data){
                prev = temp;
                temp = temp.right;
            }
            }
        if(prev.data>data){
            prev.left = new node(data);
        } 
        else if(prev.data<data){
            prev.right = new node(data);
        }
        } 
        return root;
    }

    public static boolean Rsearch(node root,int key){
        if(root == null){
            return false;
        }
           else if(root.data == key){

                return true;
            }
            else if (root.data>key){
                return Rsearch(root.left, key);
            }
            else if (root.data<key){
                return Rsearch(root.right,key);
            }
        return false;
    }
    public static boolean NRsearch(node root,int key){
        while(root!=null){
            if(root.data == key){
                return true;
            }
            else if(root.data>key){
                root = root.left;
            }
            else if(root.data<key){
                root = root.right;
            }
        }
        return false;
    }

// this is additional no require in this program i just used check the order of this bst is correct or not
    // public static void InOrder(node root){
    //     if(root == null){
    //         return;
    //     }
    //     InOrder(root.left);
    //     System.out.print(root.data+" ");
    //     InOrder(root.right);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node Root = null;
        Root = insert(Root, 4);
        Root = insert(Root, 5);
        Root = insert(Root, 2);
        Root = insert(Root, 1);
        Root = insert(Root, 3);
    System.out.println("Enter the key for search");
    int key = sc.nextInt();
    // search using recursive function.............
    boolean result = Rsearch(Root, key);
    System.out.println("search using recursive function.............");
    if (result){
    System.out.println("key is found ");
    }
    else{
        System.out.println("key is not found");
    }
    // search using non recursive function..here we are checking for when root is null...........
    boolean res2 = NRsearch(Root, key);
    System.out.println("search using non recursive function.............");
    if (res2){
    System.out.println("key is found ");
    }
    else{
        System.out.println("key is not found");
    }
    sc.close();
    }
}
