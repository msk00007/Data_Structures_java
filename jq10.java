import java.util.*;
import java.io.*;
public class jq10 {
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
            int charcount = 0;
            int wordcount = 0;
            int linecount = 0;
            for (String s : arr) {
                linecount++;
                charcount+=s.length();
                for(int i = 0 ;i<s.length();i++){
                    if(Character.compare(s.charAt(i),' ')==0){
                        wordcount+=1;
                    }
                }
                wordcount+=1;
             
            }
            System.out.println("Word count is : "+wordcount);
            System.out.println("char count is : "+charcount);
            System.out.println("line count is : "+linecount);
        }
    catch( IOException e){
        System.out.println("Error accured ");
        
    }
}
}
