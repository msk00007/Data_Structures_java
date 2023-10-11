import java.util.Scanner;
public class jq3 {
    public static void primeuptoN(int n){
        if(n>=2){
            for(int i = 2; i<=n;i++){
                boolean flag = true;
                for(int j = 2; j<=i/2;j++){
                    if(i%j==0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(i+" ");
                }
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        primeuptoN(n);
        sc.close();
    }
}
