import java.util.*;
public class jq25 {

    public static void main(String[] args) {
        Dictionary<String,Integer> mydict = new Hashtable<>();
        System.out.println("dict is empty : "+mydict.isEmpty());
        mydict.put("sai",24);
        mydict.put("a",4);
        mydict.put("b",23);
        System.out.println("The value of b is : "+mydict.get("b"));
        System.out.println("Size of the dictionary is :"+mydict.size());
        for(Enumeration<String> i = mydict.keys(); i.hasMoreElements();){
            String key = String.valueOf(i.nextElement());
            System.out.println(key+" "+mydict.get(key));

        }
        mydict.remove("sai");
        for(Enumeration<String> i = mydict.keys(); i.hasMoreElements();){
            String key = String.valueOf(i.nextElement());
            System.out.println(key+" "+mydict.get(key));
            
        }
        System.out.println("dict is empty : "+mydict.isEmpty());
    }
}