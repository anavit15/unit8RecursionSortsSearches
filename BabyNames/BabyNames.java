import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   private static int bTotal=19229058;
   private static int gTotal=18450257;
   
   public static void main(String[] args) throws FileNotFoundException
   {  
      Scanner in = new Scanner(new File("babynames80.txt"));
      RecordReader boys = new RecordReader(bTotal);
      RecordReader girls = new RecordReader(gTotal);
      while (boys.hasMore() || girls.hasMore())
      {
         int rank = in.nextInt();
         System.out.print(rank + " ");
         boys.process(in);
         girls.process(in);
         System.out.println();
      }

      in.close();
   }
}   
