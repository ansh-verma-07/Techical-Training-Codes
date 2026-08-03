 
      import java.util.Scanner;

    public class Average
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   
              float a, b, c, avg;

            System.out.println("\n Enter 3 nums : ");
               a = s.nextFloat();
               b = s.nextFloat();
               c = s.nextFloat();

               avg = (a+b+c)/3;
               
            System.out.println("\n Average = "+avg);
        } 
    }


