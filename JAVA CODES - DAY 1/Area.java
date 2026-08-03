/*
    Type Casting - conversion of one pre-defined type into another
*/ 

      import java.util.Scanner;

    public class Area
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   
              float r, area;
              final float pi = 3.14F;

            System.out.println("\n Enter radius : ");
               r = s.nextFloat();

             area = (float)(Math.PI * Math.pow(r, 2));
 
            System.out.println("\n Area of circle = "+area);
        } 
    }


