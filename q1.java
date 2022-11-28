import java.util.*;
public class q1{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    HashMap<String,Integer> myarr = new HashMap<>();
    System.out.println("enter No of elements");
    int n = sc.nextInt();
    System.out.println("enter your elements");
    for(int i = 0; i<n;i++){
        myarr.put(sc.next(),sc.nextInt());
    }
    ArrayList <Integer> arr = new ArrayList<Integer>();
    for(Integer j:myarr.values()){
        arr.add(j);
    }
    Collections.sort(arr);
    System.out.println("Sorted names using age is ");
    for (Integer j : arr) {
        for(Map.Entry<String, Integer>m :myarr.entrySet()){
            if(j==m.getValue()){
                System.out.print(m.getKey()+" ");
                myarr.remove(m.getKey());
                break;
            }
        }
    }
   
    sc.close();
}
}