import java.util.Scanner;
public class jq2 {
    public static int rfib(int n){
        if(n==1 || n == 2){
            return 1;
        }
        return rfib(n-1)+rfib(n-2);
    }
    public static int nrfib(int n){
        int t1 = 1;
        int t2 = 1;
        if(n==1 || n == 2){
            return 1;
        }
        for(int i = 2;i<n;i++){
            int temp = t2;
            t2 = t1+t2;
            t1 = temp;
        }
        return t2;
    }
    public static void main(String[] args) {
        System.out.println("Enter your nth Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
        int res = rfib(n);
        System.out.println(n+"th/rd number in the fibonaci series is : "+res);
        }
        else{
            System.out.println("Enter correct input");
        }

        if(n>0){
            int res = nrfib(n);
            System.out.println(n+"th/rd number in the fibonaci series is : "+res);
            }
            else{
                System.out.println("Enter correct input");
            }

        sc.close();
    }
}
