class sample{
    public void testmethod(){
        System.out.println("this is method of class sample");
    }
}
public class jq12 extends sample{

    public void testmethod(){
        System.out.println("This is method of class jq12");
    }
    public static void main(String[] args) {
        sample obj1 = new jq12();
        obj1.testmethod();
    }
}