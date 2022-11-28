import java.util.Scanner;
import java.io.*;
public class jq8 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
            File f = new File(filename);
            if(f.exists()){
                System.out.println("yes The file exists");
                System.out.println("Readable: "+f.canRead());
                System.out.println("writable: "+f.canWrite());
                System.out.println("The length of the file in bytes : "+f.length());
                System.out.println("type of the file is : "+f.isFile());
            }
            else{
               System.out.println("file is not exists");
            }
            sc.close();
        }
}
