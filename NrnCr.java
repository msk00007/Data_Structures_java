import java.util.*;

public class NrnCr
{
    public static long fact(int n){
        if(n==0){
            return 1;
        }
        long fact =1;
        for(int i = 1; i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
	public static void main(String[] args) {
		System.out.println("Enter the n and r values");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		if(n>=0 && r>=0){
		    if(n==r){
		        System.out.println("the nCr of the given values is : 1");
		    }else if(r==0){
		        System.out.println("the nCr of the given values is : 1");
		    }
		    else if(r==1){
		        System.out.println("the nCr of the given values is : "+n);
		    }
		    else
		    System.out.println("the nCr of the given values is : "+(fact(n)/(fact(n-r)*fact(r))));
		}
            // System.out.println(fact(n));
            // System.out.println(fact(n-r));
            // System.out.println(fact(r));
		
		sc.close();
	}
}
