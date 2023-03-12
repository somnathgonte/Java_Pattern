/*
    Input: 4
    Output: 
            *
            *  *
            *  *  *
            *  *  *  *
            *  *  *
            *  *
            *
 */
import java.util.*;
public class StarPattern4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int iRow = sc.nextInt();
  
        for(int i = 1; i <= iRow; i++)
        {
            for(int j=1; j<= i; j++)
            {
                System.out.print("* "+" ");
            }
            System.out.println();
        } 

        for(int i = 1; i <= iRow; i++)
        {
            for(int j=(iRow-1); j>= i; j--)
            {
                System.out.print("* "+" ");
            }
            System.out.println();
        }
    }  
}
