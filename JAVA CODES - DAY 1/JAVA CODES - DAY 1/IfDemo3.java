/*
    Q] Greater between 4 numbers using if..else
*/ 

      import java.util.Scanner;

    public class IfDemo3
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   
               int a, b, c, d, max;

            System.out.println("\n Enter 4 nums : ");
                a = s.nextInt(); 
                b = s.nextInt(); 
                c = s.nextInt(); 
                d = s.nextInt(); 

              max = a;

            if(max < b)
            {
                max = b;
            }
            if(max < c)
            {
                max = c;
            }
            if(max < d)
            {
                max = d;
            }

           System.out.println("\n max = "+max);
        } 
    }

