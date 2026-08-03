/*
      Exception Handling in JAVA
-----------------------------------------------------------
       TYPES OF ERRORS

  1] Compile Time Error
        example:
                 semicolon missing
  2] LOGICAL ERROR
        example:
                 if(num % 3 == 0)
                     S.o.p("EVEN");
  3] Run-Time Error
        example:
                 Divide By Zero
                 Array Index Out Of Bounds 
-------------------------------------------------------------
          try
          catch
          finally
          throw
          throws    
-------------------------------------------------------------
        java.lang.Exception
                      -ArithmeticException
                      -ArrayIndexOutOfBoundsException
                      -StringIndexOutOfBoundsException
*/

    public class ExceptionDemo1
    {
        public static void main(String [] args)
        {
             int a=10, b=0, ans=0;

            try
            {
                ans = a / b;
            } 
            catch(Exception e)
            {
               System.out.println(e);
            }
            finally
            {
               System.out.println("\n ans = "+ans);
            }   

               System.out.println("\n HELLO ");
        } 
    }



