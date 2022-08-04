// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JavaBufferedReader 
{
    public static void main(String[] args) throws IOException 
    {
        //Enter data using BufferReader
        BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
       
        // Reading data using readLine
        System.out.println("Input a line:");
        String name = reader.readLine();

        // Printing the read line
        System.out.println("Print the line:");
        System.out.println(name);        
    }
}
