class sampleException extends Exception{
    public  sampleException(String s){
        super(s);
    }
}
public class jq14 {
    public static void main(String args[]){

        try{
            int a = 17;
            int b = 0;
            int res = a/b;
            System.out.println(res);
            }
     
    catch( ArithmeticException c){
        System.out.println("this is built in Arthimetic exception ");
    }

    try{
        throw new sampleException("this is user defined exception");

    }
    catch(sampleException e){
        System.out.println("caught the user exception");
        System.out.println(e.getMessage());
    }
}
}
