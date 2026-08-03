/*
       CLASSES & OBJECTS    
       TYPE 2 - ARGUMENT WITH NO RETURN TYPE
*/

       class Abc
       {
           public void add(int a, int b)
           {
               int c;
               c = a+b;
               System.out.println("\n ADD = "+c);   
           } 
       }

    public class CO2
    {
        public static void main(String [] args)
        {
              Abc obj = new Abc();
                obj.add(11, 22);  
        }
    }
