import java.util.*;
import java.io.*;
public class jq9 {
    public static void main(String args[]){

        try{
            File obj = new File("C:\\Users\\sai krishna\\Desktop\\programs\\javaprograms\\lab_programs\\question2.txt");
            ArrayList<String> arr = new ArrayList<String>();
            Scanner Reader = new Scanner(obj);
            int counter = 1;
            while(Reader.hasNextLine()){
                String data = String.valueOf(counter)+" "+Reader.nextLine();
                counter++;
                arr.add(data);
            }
            Reader.close();
            for (String s : arr) {
                System.out.println(s);
            }
        }
    catch( IOException e){
        System.out.println("Error accured "+e);
    }
}
}
