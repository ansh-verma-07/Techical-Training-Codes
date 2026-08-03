
       class A
       {
           public A(int x, int y)
           {
               System.out.println("\n Constructor A ");
                 System.out.println("\n x = "+x);
                 System.out.println("\n y = "+y);
           }
       } 

       class B extends A
       {
           public B(int a, int b)
           {
                     super(a, b);

               System.out.println("\n Constructor B ");
                 System.out.println("\n a = "+a);
                 System.out.println("\n b = "+b);
           }
       } 

    public class Inheritance3
    {
        public static void main(String [] args)
        {
            B obj = new B(10, 20);
        } 
    }


