package FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        String fileName ="my_first_file.txt";
        String contentToWrite = "Hello, Java File! This is my first line.\n" + "And this is the second line of text.\n" + "Java I/O is fun!";

        System.out.println("---Part 1: Writing to File---");
        FileWriter writer=null;
        try{
            writer= new FileWriter(fileName);
            writer.write(contentToWrite);
            System.out.println("Data successfully written to "+fileName);
        }
        catch(IOException e){
            System.out.println("An error occurred while writing to file: "+e.getMessage());
        }
        finally{
            try {
                if (writer != null) {
                    writer.close();
                    System.out.println("File Closed");
                }
            } catch (Exception e) {
                System.out.println("Error in File Closing"+e.getMessage());
            }
        }
        System.out.println("\n----------------------------------\n");

         System.out.println("--- Part 2: Reading from File ---");
         FileReader reader = null;
         try  {
            reader = new FileReader(fileName);
            System.out.println("Reading from "+fileName+":");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char)character);
            }
            System.out.println("\nSuccessfully read data from " + fileName);

         } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occurred while reading from file: " + e.getMessage());
         }finally{
            try {
                if (reader!=null) {
                    reader.close();
                     System.out.println("FileReader closed.");
                }
            } catch (IOException e) {
                // TODO: handle exception
                System.out.println("Error closing FileReader: " + e.getMessage());
            }
         }
    }
}
