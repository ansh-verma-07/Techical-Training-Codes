/*
        Ternary Operator in JAVA

            ?   :
-------------------------------------------
     (condition) ? stmt1 : stmt2;
-------------------------------------------
 
 Q] Greater between 2 numbers using ternary operator         
*/


      import java.util.Scanner;

    public class Ternary1
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   
                int a, b, max;
 
            System.out.println("\n Enter 2 nums : ");
               a = s.nextInt();
               b = s.nextInt();

              max = (a>b) ? a : b;

            System.out.println("\n max = "+max);  
        } 
    }






