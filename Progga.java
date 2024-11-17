1.
output:
For switch case Press a buttun:6
* * * * * *
*         *
*         *
*         *
*         *
* * * * * *


code:

import java.util.*;

public class Progga
{
   public static void main(String[] args) {
    System.out.print("For switch case Press a buttun:");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {
          if(i==0||i==n-1||j==0||j==n-1)
              System.out.print("* ");
         else
          System.out.print("  ");
            
        }
        System.out.println();
     }   
   }







2.   
Enter n=3
Enter m=6
* * * * * * 
*         * 
* * * * * *
