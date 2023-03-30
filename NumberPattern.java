// Printing Numbered Square Pattern.
//Input: row = 4 col = 4.
//Output : 1  1  1  1
//         1  1  1  1
//         1  1  1  1
//         1  1  1  1

import java.util.Scanner;
public class Pattern1 
{
   public static void main(String[] args) 
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter row and col");
     int row = sc.nextInt();
     int col = sc.nextInt();
    
     for (int i = 1; i <= row; i++) 
     {
         for (int j = 1; j <=col; j++)
         {
	    System.out.print("1");
         }
         System.out.println();
     }
   }
}
