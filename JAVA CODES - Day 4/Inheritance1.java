/*
         Inheritance in JAVA
*/

       class A  // super-class  
       {
           public void show()
           {
               System.out.println("\n CLASS A ");
           } 
       }

       class B extends A // sub-class
       {
           public void disp()
           {
               System.out.println("\n CLASS B ");
           } 
       }

    public class Inheritance1
    {
        public static void main(String [] args)
        {
             B obj = new B();
               obj.show();
               obj.disp();
        } 
    }




