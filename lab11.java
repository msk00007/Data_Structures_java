import java.util.*;
public class lab11 {
    public static void B_Sort(int[] l, int lb, int ub) {
        if(lb<ub){
        for (int i = lb; i < ub; i++) {
            for (int j = 0; j < ub - i; j++) {
                if (l[j] > l[j + 1]) {
                    int temp = l[j];
                    l[j] = l[j + 1];
                    l[j + 1] = temp;
                }
            }
        }
    }
    }
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

    B_Sort(arr, 0, N-1);
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
