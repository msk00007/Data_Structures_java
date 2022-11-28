import java.util.ArrayList;
import java.util.Scanner;
 public class jq16 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your array size");
    int size = sc.nextInt();
    arraylist arr = new arraylist(size);
    for(int i = 0 ; i < size ; i++){
        System.out.println("Enter element:");
        arr.Add(sc.nextInt());
    }
    arr.Print_list();
    System.out.println(arr.isfull());
    System.out.println("Enter any index between 0 to "+size);

    int res =arr.get(sc.nextInt());
    System.out.println(res);
    arr.Add(100);
    System.out.println("Enter element to remove");
    arr.remove(sc.nextInt());
    System.out.println("Afer removing the element : ");arr.Print_list();
    System.out.println(arr.isEmpty());
    sc.close();
    
}

}

class arraylist{
    int size;
    ArrayList<Integer> myarr;
    arraylist(int size){
    this.size = size;
    this.myarr = new ArrayList<Integer>(size);
    }
    void Add(int element){
        if(!isfull()){
        myarr.add(element);
        return;
        }
        System.out.println("list is full");

    }

    public int get(int index){
        int element = myarr.get(index);
        return element;
    }

    void Print_list(){
        System.out.println(myarr);
    }

    void Insert(int index, int element){
        myarr.add(index,element);
    }
    int size(){
        return myarr.size();
    }
    void remove(int element){
        if(!isEmpty()){
        boolean res = myarr.remove(Integer.valueOf(element));
        return;
    }
    System.out.println("list is empty");
    }
    int removeAt(int index){
        if(!isEmpty()){
        int res = myarr.remove(index);
        return res;
        }
        System.out.println("list is empty");
        return -1;
    }
    boolean isEmpty(){
        return myarr.isEmpty();
    }
    boolean isfull(){
        if(myarr.size()==size){
            return true;
        }
        else{
            return false;
        }
    }

}