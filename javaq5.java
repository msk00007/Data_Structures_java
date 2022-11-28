import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class javaq5 {
    public static void main(String[] args) {
        System.out.println("Enter NO of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <String> myarr = new ArrayList<String>();
        for (int i = 0; i< n; i++){
            myarr.add(sc.next());
        }
     
        Collections.sort(myarr);
        System.out.println("The sorted order of the list is : ");
        System.out.println(myarr);
        sc.close();
    }
}
