import java.util.*;
public class lab12 {
public static void insertion(int[] arr,int lb, int ub){

    if(lb>ub){
        return;
    }
    for(int i = 1;i<=ub;i++){
        int j = i-1;
        int temp = arr[i];
        while(j>=0 && temp<arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
}
    public static int binary_search(int[] a, int lb, int ub, int key){
        if(lb<ub){
        int mid = (lb+ub)/2; 
        if(a[mid]==key){
            return mid;
        }
        if(key<a[mid]){
            for(int i=lb;i<mid;i++){
                if(a[i]==key){
                    return i;
                }
            }
        }
        else if(key>a[mid]){
            for(int i=mid+1;i<=ub;i++){
                if(a[i]==key){
                    return i;
                }
            }
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
                int element =sc.nextInt();
                a[i]=element;
            }
        insertion(a, 0, n-1);
        print_array(a);
        System.out.println("Enter the key to search..");
        int key = sc.nextInt();
        int result = binary_search(a, 0, n-1, key);
        if(result == -1){
            System.out.println("key is not found..");
        }else{
            System.out.println("the key is found at index : "+result);
        }
        sc.close();
}
    }

