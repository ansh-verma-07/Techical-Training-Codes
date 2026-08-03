/*
      switch case with integer

         Syntax:

           int x = 7;

        switch(x)
        {
            case 1:
                     -----------
                     break;
            case 2:
                     -----------
                     break;
            case 3:
                     -----------
                     break;
            case 4:
                     -----------
                     break;
            default:
                     -----------
        }
*/

 
      import java.util.Scanner;

    public class SwitchDemo1
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   
                int a, b, choice;

            System.out.println("\n Enter 2 nums : ");
               a = s.nextInt();
               b = s.nextInt();
 
            System.out.println("\n 1] ADD ");
            System.out.println("\n 2] SUB ");
            System.out.println("\n 3] MUL ");
            System.out.println("\n 4] DIV ");

          System.out.println("\n Enter your choice :  ");
             choice = s.nextInt();

             switch(choice)
             {
                 case 1:
                         System.out.println("\n ADD = "+(a+b));
                                break;
                 case 2:
                         System.out.println("\n SUB = "+(a-b));
                                break;
                 case 3:
                         System.out.println("\n MUL = "+(a*b));
                                break;
                 case 4:
                         System.out.println("\n DIV = "+(a/b));
                                break;
                 default:
                         System.out.println("\n INVALID INPUT ");
             }

        } 
    }

