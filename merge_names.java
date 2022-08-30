package java_programs;
import java.util.*;
public class merge_names {
	    
	    public static void merge(String a[], int lb, int mid, int ub){
	        int n=ub-lb+1;
	        String newarr[]= new String[n];

	        int i=lb;
	        int j=mid+1;
	        int k=0;
	        while(i<=mid && j<=ub){
	            if(a[i].compareTo(a[j])<0){
	                newarr[k]=a[i];
	                i++;
	                k++;
	            }
	            else{
	                newarr[k]=a[j];
	                j++;
	                k++;
	            }
	        }
	        while(i<=mid){
	            newarr[k]=a[i];
	            i++;
	            k++;
	        }
	        while(j<=ub){
	            newarr[k]=a[j];
	            j++;
	            k++;
	        }
	        
	        for(int s=0,y=lb;s<n;y++,s++){
	            
	            a[y]=newarr[s];
	            
	        }
	        
	    }

	    

	    public static void mergeSort(String[] m, int lb, int ub){
	        if(lb<ub){
	            int mid=(lb+ub)/2;
	            mergeSort(m, lb, mid);
	            mergeSort(m, mid+1, ub);
	            merge(m,lb,mid,ub);
	        }
	    }



	    public static void print_array(String[] m) {
	        int n=m.length;
	        for(int i=0;i<n;i++){
	            System.out.print(m[i]+" ");
	        }
	        System.out.println();
	        
	    }

	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the num of elements.........");
	        int n = sc.nextInt();
	        String a[]=new  String[n];
	        System.out.println("enter the values...........");
	        for(int i=0;i<n;i++){
	            a[i] =sc.next();
	            
	        }
	        print_array(a);
	        System.out.println();
	        mergeSort(a,0,a.length-1);
	        System.out.println("your array is ");
	        print_array(a);
	        sc.close();
	    }

	}

