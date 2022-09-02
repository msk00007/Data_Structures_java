import java.util.*;
public class lab25 {
    public static int linear(int[] arr, int lb, int ub, int key){
        if(lb>ub){
            return -1;
        }
        for(int i = lb; i<=ub; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int R_linear(int[] arr, int lb, int ub, int key){
        if(lb<=ub){
            int i = lb;
            if(arr[i]==key){
                return i;
            }
            return R_linear(arr,i+1,ub,key);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of elements..");
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i<N; i++){
            a[i]= sc.nextInt();
        }
        for(int i = 0; i<N; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Enter the key to search");
        int key = sc.nextInt();
        int result = R_linear(a, 0, a.length-1, key);
        System.out.println("Recursive linear search is invoked...");
        if(result== -1){
            System.out.println("key not found");
        }
        else if(result != -1){
            System.out.println("key value is present at indext :"+result+" and the value is : "+a[result]);
        }
        
        System.out.println("Enter the key to search");
        key = sc.nextInt();
        result = linear(a,0,a.length-1,key);
        System.out.println("NonRecursive linear search is invoked...");
        if(result== -1){
            System.out.println("key not found");
        }
        else if(result != -1){
            System.out.println("key value is present at indext :"+result+" and the value is : "+a[result]);
        }

        sc.close();
    }
}
