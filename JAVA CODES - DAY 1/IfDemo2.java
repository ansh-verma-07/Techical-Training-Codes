/*
    Q] Greater between 3 numbers using if..else

          LOGICAL OPERATORS

             AND  &&
             OR   ||
             NOT  !
*/ 

      import java.util.Scanner;

    public class IfDemo2
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   
               int a, b, c;

            System.out.println("\n Enter 3 nums : ");
                a = s.nextInt();
                b = s.nextInt();
                c = s.nextInt();

            if(a>b && a>c)
            {
                System.out.println("\n max = "+a);
            } 
            else if(b>c)
            {
                System.out.println("\n max = "+b);
            } 
            else
            {
                System.out.println("\n max = "+c);
            } 
        } 
    }