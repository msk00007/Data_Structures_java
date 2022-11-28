import java.util.*;
public class jq4 {
    public static void main(String[] args) {
        System.out.println("Enter your string : ");
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        if(s.compareTo(s1)==0){
            System.out.println("Given String is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
