import java.util.*;
public class test10{
    public static void merge(String[] a, int lb, int mid,int ub){
        int size = ub-lb+1;
        String[] temparr = new String[size];
        int i = lb;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ub){
            if(a[i].compareTo(a[j])< 0){
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

    public static void mergeSort(String[] arr, int lb, int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    public static void print_list(String[] arr){
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
        String[] a = new String[N];
        for (int i = 0; i<N; i++){
            a[i]=sc.next();

        }
        mergeSort(a, 0, N-1);
        print_list(a);
        sc.close();


    }

}