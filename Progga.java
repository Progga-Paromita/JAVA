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

code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     System.out.print("Enter m=");
     int m=s.nextInt();
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
          if(i==0||i==n-1||j==0||j==m-1)
              System.out.print("* ");
         else
          System.out.print("  ");
            
        }
        System.out.println();
     }   
   }
}







3.
   Enter n=5
*
* *
* * *
* * * *
* * * * *

code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=i;j++)
        {
                 System.out.print("* ");
            
        }
        System.out.println();
     }   
   }
}







4.
Enter n=4
* * * * 
* * * 
* * 
*
 
code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=n-i+1;j++)
        {
             System.out.print("* ");
            
        }
        System.out.println();
     }   
   }
}


or,
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=n;i>=1;i--)
     {
        for(int j=1;j<=i;j++)
        {
             System.out.print("* ");
            
        }
        System.out.println();
     }   
   }
}







5.
Enter n=5
* * * * *
* * * *
* * *
* *
*

code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=n+1;i>=1;i--)
     {
      for(int j=i-1;j>=1;j--)
      {
        System.out.print("* ");
      }
      for(int j=1;j<=n-i+1;j++)
      {
        System.out.print("  ");
      }
        System.out.println();
     } 
   }
}








6.
Enter n=5
1 
1 2 
1 2 3
1 2 3 4
1 2 3 4 5

code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=1;i<=n;i++)
     {  
      for(int j=1;j<=i;j++)
      {
        System.out.print(j);
        System.out.print(" ");
      }
        System.out.println();
     } 
   }
}







7.
Enter n=5
5 4 3 2 1 
4 3 2 1 
3 2 1
2 1
1
   
code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=n;i>=1;i--)
     {  
      for(int j=i;j>=1;j--)
      {
        System.out.print(j);
        System.out.print(" ");
      }
        System.out.println();
     } 
   }
}








8.
Enter n=5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=1;i<=n;i++)
     {  
      for(int j=1;j<=n-i+1;j++)
      {
        System.out.print(j);
        System.out.print(" ");
      }
        System.out.println();
     } 
   }
  }








9.
Enter n=5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int count=1;
     for(int i=1;i<=n;i++)
     {  
      for(int j=1;j<=i;j++)
      {
        System.out.print(count);
        System.out.print(" ");
        count++;
      }
        System.out.println();
     } 
   }
}








9.
Enter n=5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

code:
import java.util.*;
public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
    
     for(int i=1;i<=n;i++)
     {  
      for(int j=1;j<=i;j++)
      {
        System.out.print((i+j-1)%2);
        System.out.print(" ");
        //count++;
      }
        System.out.println();
     } 
   }
}







10.
Enter n=5
1
0 0
1 1 1
0 0 0 0
1 1 1 1 1

code:
import java.util.*;

public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=1;i<=n;i++)
     {  
      for(int j=1;j<=i;j++)
      {
        System.out.print(i%2);
        System.out.print(" ");
      }
        System.out.println();
     } 
   }
}









11.
Enter n=5
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1

code:
import java.util.*;

public class Progga
{
   public static void main(String[] args) {
    System.out.print("Enter n=");
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     for(int i=1;i<=n;i++)
     {  
      for(int j=1;j<=i;j++)
      {
        System.out.print(j%2);
        System.out.print(" ");
      }
        System.out.println();
     } 
   }
}









