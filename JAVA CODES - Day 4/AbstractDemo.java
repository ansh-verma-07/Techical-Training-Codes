/*
         Abstract Classes in JAVA

  1] Abstract classes are declared using keyword abstract.
  2] Abstract classes can not be instantiated.    
  3] It can contain constructors, abstract methods and non-abstract methods.
  4] They are mostly super-classes.

         Abstract Methods in JAVA

  1] Abstract methods are declared using keyword abstract.
  2] It must be declared inside abstract class only.
  3] It does not contain implementation code.
  4] Its declaration ends with semicolon(;)
  5] It must be overriden in sub-classes.
 */
      
       abstract class Abc
       {
            public Abc()
            {
            }

           public abstract void add(int a, int b);                        
       }

       class Xyz extends Abc
       {
           public void add(int a, int b)
           {
           }
       }

    public class AbstractDemo
    {
        public static void main(String [] args)
        {
             Abc obj = new Abc();
        } 
    }


