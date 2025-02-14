package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[]args){
        String sourceFile = "src/main/java/FileHandling/input.txt";
        String destinationFile = "src/main/java/FileHandling/output.txt";
        
        try (FileInputStream fileinput = new FileInputStream(sourceFile);
             FileOutputStream fileoutput = new FileOutputStream(destinationFile) ) {

            int byteData;
            while((byteData = fileinput.read())!=-1){
                fileoutput.write(byteData);
            }
            System.out.println("FILE COPIED SUCCESSFULLY");

        }
            
            catch(FileNotFoundException e){
            System.out.println("Source.txt file not found");
                
            }
            
            catch (IOException e){
                e.printStackTrace();
        }
    }
}
