import java.util.*;
public class lab22{
    public static void insertion(String[] arr,int lb, int ub){

        if(lb>ub){
            return;
        }
        for(int i = 1;i<=ub;i++){
            int j = i-1;
            String temp = arr[i];
            while(j>=0 && temp.compareTo(arr[j])<0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
        public static int binary_search(String[] a, int lb, int ub, String key){
            if(lb<ub){
            int mid = (lb+ub)/2; 
            if(a[mid].equals(key)){
                return mid;
            }
            if(key.compareTo(a[mid])<0){
                for(int i=lb;i<mid;i++){
                    if(a[i]==key){
                        return i;
                    }
                }
            }
            else if(key.compareTo(a[mid])>0){
                for(int i=mid+1;i<=ub;i++){
                    if(a[i]==key){
                        return i;
                    }
                }
            }
        }
        return -1;
        }
        
     // print list code............................
     public static void printlist(String[] l) {
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i] + " ");
        }
    }

    public static void main(String[] args){
        System.out.println("enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        System.out.println("Enter the elements....");
        for(int i = 0;i<n;i++){
            a[i]=sc.next();
        }
        insertion(a,0,n-1);
        printlist(a);
        System.out.println("enter the key to search");
        String key = sc.next();
        int result = binary_search(a, 0, a.length-1, key);
        if(result== -1){
            System.out.println("key not found");
        }
        else if(result != -1){
            System.out.println("key value is present at indext :"+result+" and the value is : "+a[result]);
        }
        sc.close();
    }

}