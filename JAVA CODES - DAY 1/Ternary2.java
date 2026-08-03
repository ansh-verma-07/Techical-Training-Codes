/*
        Ternary Operator in JAVA

            ?   :
-------------------------------------------
     (condition) ? stmt1 : stmt2;
-------------------------------------------
 
 Q] Greater between 2 numbers using ternary operator         
*/


      import java.util.Scanner;

    public class Ternary2
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   
                int a, b,c, max;
 
            System.out.println("\n Enter 3 nums : ");
               a = s.nextInt();
               b = s.nextInt();
               c = s.nextInt();

          max = (a>b && a>c) ? a : (b>c) ? b : c;

            System.out.println("\n max = "+max);  
        } 
    }






