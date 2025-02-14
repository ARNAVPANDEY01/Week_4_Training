package SecondFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingOutput {
    public static void main(String[]args){
        String sourcePath = "src/main/java/SecondFileHandling/input.txt";

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter Your Name: ");
            String name = input.next();

            System.out.println("Enter Your Age");
            int age = input.nextInt();

            String details= "Name: " + name + "\nAge: "+ age + "\n" ;

            FileOutputStream fileOutput = new FileOutputStream(sourcePath);

            fileOutput.write(details.getBytes());
            System.out.println("Details Added");

        }
        catch(IOException e){
            e.printStackTrace();
        }

        }
}
