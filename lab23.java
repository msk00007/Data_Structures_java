import java.util.*;
public class lab23 {
    
public static int partition(String[] arr, int lb, int ub){
    String pivot = arr[lb];
    int i = lb;
    int j = ub;
    while(i<j){
        while(i<ub && arr[i].compareTo(pivot)<=0){
            i++;
        }
        while(arr[j].compareTo(pivot)>0){
            j--;
        }
        if(i<j){
            String temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }
    }
    arr[lb]=arr[j];
    arr[j]=pivot;
    return j;
}
public static void Quicksort(String[] arr, int lb, int ub){
if(lb<ub){
    int pos = partition(arr, lb, ub);
    Quicksort(arr, lb, pos-1);
    Quicksort(arr, pos+1, ub);
}

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the range of elements..");
    int N = sc.nextInt();
    String[] a = new String[N];
    for(int i = 0; i<N; i++){
        a[i]= sc.next();
    }
    Quicksort(a, 0, N-1);
    for(int i = 0; i<N; i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
    sc.close();
}
}

