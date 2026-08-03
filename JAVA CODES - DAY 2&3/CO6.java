/*
      Default Values    
*/

       class Abc
       {
            int i;
            float f;
            double d;
            char ch;
            boolean b;
            String s;

           public void show()
           {                 
                   int x=123;

               System.out.println("\n x = "+x);

               System.out.println("\n i = "+i);
               System.out.println("\n f = "+f);
               System.out.println("\n d = "+d);
               System.out.println("\n ch = "+ch);
               System.out.println("\n b = "+b);
               System.out.println("\n s = "+s);
           }       
       } 

    public class CO6
    {
        public static void main(String [] args)
        {
              Abc obj = new Abc();
                  obj.show();
        }
    }

