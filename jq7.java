import java.util.StringTokenizer;
import java.util.Scanner;

public class jq7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your line of strings :integers seperated by commas");
      int sum = 0;
      String s = sc.next();
      StringTokenizer st = new StringTokenizer(s,",");
      while(st.hasMoreTokens()){
        int i = Integer.parseInt(st.nextToken());
        System.out.println(i);
        sum+=i;
      }
      System.out.println("The sum of integers is : "+sum);
      sc.close();
    }
}
