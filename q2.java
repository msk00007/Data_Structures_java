import java.util.*;
import java.io.*;
public class q2 {
    public static void main(String args[]){

        try{
            File obj = new File("C:\\Users\\sai krishna\\Desktop\\programs\\javaprograms\\lab_programs\\question2.txt");
            ArrayList<String> arr = new ArrayList<String>();
            Scanner Reader = new Scanner(obj);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                arr.add(data);
            }
            Reader.close();
            Collections.sort(arr);
            for (String s : arr) {
                System.out.println(s);
            }
        }
    catch( IOException e){
        System.out.println("Error accured "+e);
    }
}
}
