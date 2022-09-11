import java.util.Scanner;

public class binary_search {

    public static int Bsearch(int[] m,int lb, int ub,int key){
        while(lb<=ub){
            int mid= (lb+ub)/2;
            if(m[mid]==key){
                return mid;
            }
            else if(key<m[mid]){
                ub=mid-1;
                Bsearch(m,lb,ub,key);
            }
            else{
                lb=mid+1;
                Bsearch(m,lb,ub,key);
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
        Scanner sc= new Scanner(System.in);
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
        int x=Bsearch(a,0,n-1,key);
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
