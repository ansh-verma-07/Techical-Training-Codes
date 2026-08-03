/*
     Q] Program to check char value

           'A' = Upper Case
           'a' = Lower Case
           '5' = Digit
           '@' = Special Char
*/ 

      import java.util.Scanner;

    public class IfDemo5
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   

           System.out.println("\n Enter a char : ");
             char ch = s.next().charAt(0);

           if(ch >= 'A' && ch <= 'Z')
           {
               System.out.println("\n UPPER CASE ");
           } 
           else if(ch >= 'a' && ch <= 'z')
           {
               System.out.println("\n LOWER CASE ");
           } 
           else if(ch >= '0' && ch <= '9')
           {
               System.out.println("\n DIGIT ");
           } 
           else
           {
               System.out.println("\n SPECIAL CHAR ");
           } 
        } 
    }


