/*
       throws keyword in Exception handling
*/

       class Abc
       {
           public void div(int a, int b)throws Exception
           {
              System.out.println("\n DIV = "+(a/b));
           }
       }

    public class ExceptionDemo4
    {
        public static void main(String [] args)throws Exception
        {
               Abc obj = new Abc();                  
                  obj.div(10, 2);

                try
                {
                   obj.div(10, 2);
                }
                catch(Exception e)
                {}   
        } 
    }
