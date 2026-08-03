/*
        Final Classes in JAVA

   1] Final classes are declared using keyword final
   2] Final classes can not be inherited.
   3] They are mostly sub-classes.

        Final Methods in JAVA

   1] Final methods are declared using keyword final
   2] Final methods can not be overriden in sub-classes.
*/
 
       final class Abc
       {
            final float PI = 3.14f;

           public final void add(int a, int b)
           {
           }  
       }

       class Xyz extends Abc
       {
           public void add(int a, int b)
           {
           }  
       }

    public class FinalDemo
    {
        public static void main(String [] args)
        {
        } 
    }