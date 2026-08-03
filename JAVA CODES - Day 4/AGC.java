/*
     AUTOMATIC GARBAGE COLLECTOR
*/

       class Abc
       {
             int a, b;
 
           public Abc()  // Default Constructor
           {
               a = 10;
               b = 20; 
           }  

           public Abc(int x, int y) // Parameterised Constructor
           {
               a = x;
               b = y; 
           } 

           public void show()
           {
               System.out.println("\n a = "+a);
               System.out.println("\n b = "+b);  
           }

           public void finalize()
           {
               System.out.println("\n finalize() is called....");
           }
       }

    public class AGC
    {
        public static void main(String [] args)
        {
             Abc A = new Abc();
                 A.show();

             Abc B = new Abc(11, 22);
                 B.show();

             Abc C = new Abc(100, 200);
                 C.show();

                 A = null;
                 B = null;
                 C = null;

                 System.gc();                 

              try
              {
                  Thread.sleep(1000);
              }
              catch(Exception e)
              {} 
        } 
    }
