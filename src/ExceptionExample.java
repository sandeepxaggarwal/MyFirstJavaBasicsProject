import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample
{

   public static void main(String[] args)
   {

      // FileInputStream fis = new FileInputStream("C:\\Book1.xlsx");

      // Thread.sleep(3000);//
      // int x =4/0;
      try
      {
         int x = 4 / 2;
         FileInputStream fis = new FileInputStream("C:\\Book132432.xlsx");
      }
      catch (ArithmeticException e)
      {

         System.out.println("Divide by zero exception occured");
         e.printStackTrace();
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found exception occured");
      }

      System.out.println("Welcome");

   }

}
