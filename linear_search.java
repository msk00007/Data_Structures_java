
import java.util.Scanner;

public class linear_search{
    public static int Lsearch(int[] m,int lb, int ub, int key) {
        for(int i = lb;i<ub;i++){
            if(m[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void print_array(int[] m) {
        int n=m.length;
        for(int i=0;i<n;i++){
            System.out.print(m[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of elements.........");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the values...........");
        for(int i=0;i<n;i++){
            int x =sc.nextInt();
            a[i]=x;
        }
        System.out.println("Enter the key value to  search");
        int key = sc.nextInt();
       int x= Lsearch(a,0,n,key);
        System.out.println("your array is ");
        print_array(a);

        if(x!=(-1)){
            System.out.println("The key "+key+" is found at index :"+x);
        }
        else if(x==(-1)){
            System.out.println("key not found.");
        }
        sc.close();
    }
}