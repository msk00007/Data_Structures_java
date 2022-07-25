import java.util.*;
public class Quicksort{

public static int partition(int[] arr, int lb, int ub){

    int i=lb;
    int j=ub;
    int pivot=arr[lb];
    while(i<j){
        while( i<=ub && arr[i]<=pivot){
            i++;
           
        }
        while( j>lb && arr[j]>pivot){
            j--;
            
        }
        if(i<j){
            
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
    }
    arr[lb]=arr[j];
    arr[j]=pivot;
    return j;
}

public static void quick(int[] arr,int lb, int ub ){
    if(lb<ub){
    int pos= partition(arr,lb,ub);
    quick(arr,lb,pos);
    quick(arr,pos+1,ub);
    }
}



    public static void main(String[] args) {
        int n;
        System.out.println("Enter the length of the array..");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        quick(a, 0, a.length-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
