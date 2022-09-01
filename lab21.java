import java.util.*;
public class lab21 {
    public static void selectionSort(String[] a, int lb, int ub){
        if(lb>ub){
            return ;
        }
        for(int i = lb; i<ub;i++){
            String minvalue = a[i];
            int min = i;
            for (int j = i+1;j<=ub;j++){
                if(a[min].compareTo(a[j])>0){
                    min = j;
                }
            }
            a[i]=a[min];
            a[min]=minvalue;
        }
    }
     // print list code............................
     public static void printlist(String[] l) {
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i] + " ");
        }
    }

    public static int binary_search(String[] a, int lb, int ub, String key){
        if(lb<ub){
        int mid = (lb+ub)/2; 
        if(a[mid].compareTo(key)==0){
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
        return -1;
    }
    return -1;
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
        selectionSort(a,0,n-1);
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
