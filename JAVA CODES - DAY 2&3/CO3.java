/*
       CLASSES & OBJECTS    
       TYPE 3 - ARGUMENT WITH RETURN TYPE
*/

       class Abc
       {
           public int add(int a, int b)
           {
               int c;
               c = a+b;
               return c;   
           } 
       }

    public class CO3
    {
        public static void main(String [] args)
        {
              Abc obj = new Abc();

              int ans = obj.add(11, 22);

              System.out.println("\n Addition = "+ans);     
        }
    }
