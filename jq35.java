import java.util.*;
import java.io.*;
public class jq35 {
    public static void main(String args[]){

        try{
            File obj = new File("C:\\Users\\HP\\Desktop\\programs\\javaprograms\\lab_programs\\question2.txt");
            ArrayList<String> arr = new ArrayList<String>();
            Scanner Reader = new Scanner(obj);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                arr.add(data);
            }
            Reader.close();
            HashMap<String,Integer> mymap = new HashMap<>();
            for (String string : arr) {
                for (String str : string.split(" ")) {
                    if(mymap.containsKey(str)){
                        int a = mymap.get(str);
                        mymap.replace(str, a,a+1 );
                    }
                    else{
                        mymap.put(str,1);
                    }
                }
            }
            for(Map.Entry<String,Integer> m:mymap.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        
          
        }
    catch( IOException e){
        System.out.println("Error accured ");
        
    }
}
}

