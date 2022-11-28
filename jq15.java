import java.util.*;
public class jq15 {
  public static int Rlinear(int[]a,int lb, int ub,int key){
    if(lb>ub){
        return -1;
    }
    
    if(a[lb]==key){
        return lb;
    }
    else{
        return Rlinear(a, lb+1, ub, key);
    }
  }  
  public static int Nrlinear(int[]a, int lb, int ub, int key){
    if(lb<ub){
        for(int i = 0;i<=ub;i++){
            if(a[i]==key){
                return i;
            }
        }
    }
    return -1;
  }
  public static int Rbinary(int[]a, int lb, int ub, int key){
    if(lb<=ub){
        int mid =(lb+ub)/2;
        if(a[mid]==key){
            return mid;
        }
        else if(a[mid]>key){
            return Rbinary(a, lb, mid-1, key);
        }
        else if(a[mid]<key){
            return Rbinary(a, mid+1, ub, key);
        }
    }
    return -1;
  }
  public static int NRbinary(int[]a, int lb, int ub, int key){
    while(lb<=ub){
        int mid = (lb+ub)/2;
        if(a[mid]== key){
            return mid;
        }
        else if(a[mid]>key){
            ub = mid-1;
        }
        else if(a[mid]<key){
            lb= mid+1;
        }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements");
    int n = sc.nextInt();
    int[]a = new int[n];
    System.out.println("Enter the elements");
    for(int i = 0; i< n; i++){
        a[i]= sc.nextInt();
    }
    System.out.println("Enter your key : ");
    int key = sc.nextInt();
    int res1 = Rlinear(a,0, n-1, key);
    int res2 = Nrlinear(a, 0, n-1, key);
    int res3 = Rbinary(a, 0, n-1, key);
    int res4 = NRbinary(a, 0, n-1, key);
    if(res1 == -1){
        System.out.println(" R linear : key not found");
    }
    else{
        System.out.println("key found at : "+res1);
    }
    if(res2 == -1){
        System.out.println(" Nrlinear : key not found");
    }
    else{
        System.out.println("key found at : "+res2);
    }
    if(res3 == -1){
        System.out.println(" Rbinary  : key not found");
    }
    else{
        System.out.println("key found at : "+res3);
    }
    if(res4 == -1){
        System.out.println(" NRbinary : key not found");
    }
    else{
        System.out.println("key found at : "+res4);
    }
    sc.close();
  }
}
