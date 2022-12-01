import java.util.*;
public class jq21 {
    public static void main(String[] args) {
        mystack st = new mystack();
        Queue <Integer> q = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("stack is empty : "+st.isEmpty());
        System.out.println("Enter integers and to stop press any character except integers");
        while(true){
            try{
            st.push(sc.nextInt());
            }
            catch (InputMismatchException e) {
                char c = sc.next().charAt(0);
                break;
            }
        }
        System.out.println(st);
        System.out.println("stack is empty : "+st.isEmpty());
        st.pop();
        System.out.println(st);

        System.out.println("queue is empty : "+q.isEmpty());
        System.out.println("Enter integers and to stop press any character except integers");
        while(true){
            try{
            q.add(sc.nextInt());
            }
            catch (InputMismatchException e) {
               char c = sc.next().charAt(0);
                break;
            }
        }
        for (Integer i : q) {
            System.out.print(i+" ");
        }
        System.out.println("\nqueue is empty : "+q.isEmpty());
        q.remove();
        for (Integer i : q) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
class mystack extends LinkedList{
}