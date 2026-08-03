/*
     Q] Program to check Even or ODD

        10 / 2 = 5
 
        10 % 2 = 0  
*/ 

      import java.util.Scanner;

    public class IfDemo4
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   
            
            System.out.println("\n Enter a num : ");
               int num = s.nextInt();

           if(num % 2 == 0)
           {
               System.out.println("\n EVEN ");  
           }  
           else
           {
               System.out.println("\n ODD ");  
           }  
        } 
    }
