/*
       CLASSES & OBJECTS    
       TYPE 1 - NO ARGUMENT NO RETURN TYPE
*/

            import java.util.Scanner;

       class Abc
       {
           public void add()
           {
               Scanner s = new Scanner(System.in);
                   int a, b, c;

               System.out.println("\n Enter 2 nums : ");
                 a = s.nextInt();
                 b = s.nextInt();
  
                 c = a+b;

               System.out.println("\n Addition = "+c);
           }
       }

    public class CO1
    {
        public static void main(String [] args)
        {
              Abc obj = new Abc();
                 obj.add();
       }
    }





