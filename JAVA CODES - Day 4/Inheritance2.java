/*
      Constructor in Inheritance
*/

       class A
       {
           public A()
           {
               System.out.println("\n Constructor A ");
           }
       } 

       class B extends A
       {
           public B()
           {
                  super();
               System.out.println("\n Constructor B ");
           }
       } 

    public class Inheritance2
    {
        public static void main(String [] args)
        {
              B obj = new B();
        } 
    }



