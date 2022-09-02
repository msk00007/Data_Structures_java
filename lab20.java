import java.util.*;
public class lab20 {
    public static void B_Sort(String[] l, int lb, int ub) {
        for (int i = lb; i < ub; i++) {
            for (int j = 0; j < ub - i; j++) {
                if (l[j].compareTo(l[j+1])>0) {
                    String temp = l[j];
                    l[j] = l[j + 1];
                    l[j + 1] = temp;
                }
            }
        }
    }

    // print list code............................
    public static void printlist(String[] l) {
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i] + " ");
        }
    }

    public static int binary_search(String[] a, int lb, int ub, String key){
        if(lb<=ub){
        int mid = (lb+ub)/2; 
        if(a[mid].compareTo(key)==0){
            return mid;
        }
        else if(key.compareTo(a[mid])<0){     
      return binary_search(a, lb, mid-1, key);
        }
        else {
      return binary_search(a, mid+1,ub,key);
        }
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
        B_Sort(a,0,n-1);
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
