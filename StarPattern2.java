/*
   Input : iRow = 4 
   Output : *  
            * * 
            * * * 
            * * * *
 */
import java.util.*;
public class Pattern2 
{
    public static void main(String ardg[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int iRow = sc.nextInt();

        for(int i = 0; i <= iRow; i++)
        {
            for(int j=1; j<= i; j++)
            {
                System.out.print("* "+" ");
            }
            System.out.println();
        } 
    }
}
