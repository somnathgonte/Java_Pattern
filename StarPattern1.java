/* 
    Input : iRow = 4 iCol = 4
    Output : * * * *
             * * * *
             * * * *
             * * * *
*/
import java.util.*;
public class Pattern1
{
    public static void main(String []arg)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter rows and columns: ");
      int iRow = sc.nextInt();
      int iCol= sc.nextInt();

      for(int i=1; i<=iRow; i++)
      {
        for(int j=1; j<=iCol; j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println(" ");
      }

    }
}
