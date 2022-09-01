import java.util.*;
public class lab9 {
    public static void merge(int[] a, int lb, int mid,int ub){
        int size = ub-lb+1;
        int[] temparr = new int[size];
        int i = lb;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ub){
            if(a[i]<a[j]){
                temparr[k]=a[i];
                i++;
                k++;
            }else{
                temparr[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temparr[k]=a[i];
            i++;
            k++;
        }
        while(j<=ub){
            temparr[k]=a[j];
            j++;
            k++;
        }
        for (int l = lb,s=0;s<size;s++,l++){
            a[l]= temparr[s];
        }
    }

    public static void mergeSort(int[] arr, int lb, int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    public static void print_list(int[] arr){
        int size = arr.length;
        for(int i = 0; i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range \n");
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i<N; i++){
            a[i]=sc.nextInt();

        }
        mergeSort(a, 0, N-1);
        print_list(a);
        sc.close();


    }



}
