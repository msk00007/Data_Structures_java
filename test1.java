import java.util.Scanner;

public class test1 {
    public static void bsort(int[] arr,int lb, int ub){
        if(lb<ub){
            for(int i =0;i<ub;i++){
                for(int j = 0;j<ub-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }
    public static void printlist(int[] arr){
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int bsearch(int[] arr,int lb, int ub,int key){
        while(lb<=ub){
            int mid = (lb+ub)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key<arr[mid]){
            ub = mid-1
            }
            else if(key>arr[mid]){
           lb = mid+1
        }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements....");
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bsort(a,0,n-1);
        printlist(a);
        System.out.println("enter the key to search");
        int key = sc.nextInt();
        int result = bsearch(a, 0, a.length-1, key);
        if(result== -1){
            System.out.println("key not found");
        }
        else if(result != -1){
            System.out.println("key value is present at indext :"+result+" and the value is : "+a[result]);
        }
        sc.close();
    }
}
