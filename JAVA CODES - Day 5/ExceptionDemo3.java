/*
       USER DEFINED EXCEPTION
       using throw keyword
*/

         import java.util.Scanner;

      class MobileException extends Exception
      {
           public MobileException(String str)
           {
               super(str);
           }
      }

    public class ExceptionDemo3
    {
        public static void main(String [] args)
        {
             Scanner s = new Scanner(System.in);   
              
            System.out.println("\n Enter mobile number : ");
               String mobile = s.nextLine(); 

             try
             {
                 if(mobile.length() != 10)
                 {
                    throw new MobileException("INVALID MOBILE NUMBER");  
                 }
             }
             catch(Exception e)
             {
                  System.out.println(e);
             }      
        } 
    }
