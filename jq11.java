class mythread1 implements Runnable{
    public void run(){
        for(int i = 0; i<10; i++){
        System.out.println("this is thread runable ");
        }
    }
}
public class jq11 extends Thread{

public void run(){

    for(int i = 0; i<10; i++){
    System.out.println("thread using thread class..");
    }
}
public static void main(String[] args) {
mythread1 bullet1 = new mythread1();
Thread gun1 = new Thread(bullet1);
gun1.start();
jq11 t1 = new jq11();
t1.start();


}
    
}