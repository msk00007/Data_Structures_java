import java.util.*;
public class lab4{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size =sc.nextInt();
        stack s = new stack(size);
        try{
        for(int i = 0 ; i< size ;i++){
            int elem = sc.nextInt();
        s.push(elem);
        }
    }catch(InputMismatchException e){
        System.out.println("insertion completed..");
    }
    s.printStack();
    System.out.println("is stack is full "+s.isFull());
    int pop_element=s.pop();
    System.out.println(pop_element);
    s.push(pop_element);
    s.push(555);
    s.printStack();
    System.out.println("is stack is emptty "+s.isEmpty());
    System.out.println("is stack is full "+s.isFull());
        sc.close();
    }

}
 class stack{
    static int top = -1;
    int[] a;
    stack(int num){
         this.a = new int[num];
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(top==a.length-1){
            return true;
        }
        return false;
    }
    public void push(int element){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        else
                a[++top]=element;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty cannot perform pop action");
            return top;
        }
        int pop_Element=a[top];
        --top;
        return pop_Element;
    }
    public void printStack(){
        if(isEmpty()){
            System.out.println("list is empty...");
            return;
        }
        System.out.println("list  in reverse order");
        for(int i = top;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
} 
