import java.util.*;
public class lab15 {
    public static void selectionSort(int[] a, int lb, int ub){
        if(lb>ub){
            return ;
        }
        for(int i = lb; i<ub;i++){
            int minvalue = a[i];
            int min = i;
            for (int j = i+1;j<=ub;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            a[i]=a[min];
            a[min]=minvalue;
        }
       }
        public static int bsearch(int[] arr,int lb, int ub,int key){
        while(lb<=ub){
            int mid = (lb+ub)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key<arr[mid]){
            ub = mid-1;
            }
            else if(key>arr[mid]){
           lb = mid+1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
    System.out.println("Enter the range ");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if(N<=0){
        System.out.println("enter the valid number...");
        sc.close();
        return ;
    }
    int[] arr = new int[N];
    for (int i = 0; i<N; i++){
        arr[i]= sc.nextInt();
    }
    
    selectionSort(arr, 0, N-1);
    for(int i = 0; i< N; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("\n Enter the key to search...");
    int key = sc.nextInt();
    int result = Bsearch(arr, 0, N-1, key);
    if(result != -1){
        System.out.println("key is found at index : "+result);
    }else{
        System.out.println("element is not found");
    }
    sc.close();
    }
}
