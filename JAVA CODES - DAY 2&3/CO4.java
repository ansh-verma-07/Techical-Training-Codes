/*
      Method Overloading

      Methods with same name but different parameters 
      within same class.

      It is also called as Compile Time Polymorphism.
*/
   
       class Abc
       {
           public void add(int a, int b)
           {
               System.out.println("\n ADD = "+(a+b));
           }

           public void add(double a, double b)
           {
               System.out.println("\n ADD = "+(a+b));
           }

           public void add(int a, int b, int c)
           {
               System.out.println("\n ADD = "+(a+b+c));
           }
       }

    public class CO4
    {
        public static void main(String [] args)
        {
              Abc obj = new Abc();  
       
               obj.add(10, 20);
               obj.add(10.11, 20.22);
               obj.add(11, 22, 33);
        }
    }
















