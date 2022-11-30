import java.util.*;

public class jq16 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        System.out.println("Enter the range of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        System.out.println("Enter index for search the element : ");
        int ind = sc.nextInt();
        System.out.println("element at index " + ind + " : " + l.get(ind));
        System.out.println("Enter element to get the index:");
        int ele = sc.nextInt();
        System.out.println("index of element " + ele + " is " + l.indexOf(ele));
        for (Integer i : l) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("list is empty: " + l.isEmpty());
        l.remove(0);
        System.out.println("After removing element : " + l);
        l.removeAll(l);
        System.out.println("After removing all elements : " + l);

        List<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the range of elements : ");
        int N = sc.nextInt();
        System.out.println("Enter elements");
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter index for search the element : ");
        ind = sc.nextInt();
        System.out.println("element at index " + ind + " : " + list.get(ind));
        System.out.println("Enter element to get the index:");
        ele = sc.nextInt();
        System.out.println("index of element " + ele + " is " + list.indexOf(ele));
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("list is empty: " + list.isEmpty());
        list.remove(0);
        System.out.println("After removing element : " + list);
        list.removeAll(list);
        System.out.println("After removing all elements : " + list);

        sc.close();

    }

}
