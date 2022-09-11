import java.util.Scanner;
public class test8 {
    public static int partition(int[] a, int lb, int ub){
        int pivot = a[lb];
        int i = lb;
        int j = ub;
        while(i<j){
        while(i<=ub && a[i]<=pivot){
            i++;
        }
        while(a[j]>pivot){
            j--;
        }
        if(i<j){
            int temp = a[i];
            a[i]= a[j];
            a[j]= temp;
        }
    }
        a[lb] = a[j];
        a[j]= pivot;
        return j;
    }
    public static void quicksort(int[] arr, int lb, int ub){
        if(lb<ub){
        int pos;
        pos= partition(arr, lb,ub);
        quicksort(arr, lb,pos-1);
        quicksort(arr,pos+1,ub);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for( int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        }

    }
