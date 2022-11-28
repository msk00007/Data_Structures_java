import java.util.Scanner;
public class jq1 {
    public static void main(String[] args) {
        System.out.println("Enter values for a,b,c : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = (b*b)-4*(a*c);
        System.out.println(res);
        if(res>=0){
            Double x1 = (-b + (Math.sqrt(res)))/2*a;
            Double x2 = (-b - Math.sqrt(res))/2*a;
            System.out.println("x1 is "+x1+", x2 is "+x2);
        }
        else{
            System.out.println("There is no real solutions");
        }
        sc.close();
    }
}
