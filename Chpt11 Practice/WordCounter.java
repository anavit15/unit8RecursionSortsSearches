import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Write a description of class WordCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordCounter
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class WordCounter
     */
    public WordCounter()
    {
        // initialise instance variables
        
    }

    public static void main (String[] args) throws FileNotFoundException
    {
        int count=0;
        File inputFile=new File("input.txt");
        Scanner in=new Scanner(inputFile);
        Scanner in2=new Scanner(inputFile);
        in.useDelimiter(" ");
        while(in.hasNext())
        {
            in.next();
            count++;
        }
        int count2=0;
        while (in2.hasNextLine())
        {
            in2.nextLine();
            count2++;
        }
        in.close();
        in2.close();
        System.out.println("Number of Words: "+ count);
        System.out.println("Number of Lines: "+ count2);
    }

}
