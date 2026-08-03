/*
                 A   B
                   C
         Interface : Multiple Inheritance
 
  1] Interfaces are declared using keyword interface.
  2] Methods of interface are by default public and abstract.
  3] A class can implements multiple interfaces.
  4] Methods of interface must be overriden in sub-classes.
  5] Interfaces can not be instantiated.
  6] It can not contain constructors. 
  7] An interface can extends multiple interfaces.
*/

      interface Addition
      {
          public abstract void add(int a, int b);
      }  

      interface Multiplication
      {
          public abstract void mul(int a, int b);
      }  

      class Abc implements Addition, Multiplication
      {
          public void add(int a, int b)
          {
              System.out.println("\n Addition = "+(a+b));
          }

          public void mul(int a, int b)
          {
              System.out.println("\n Multiplication = "+(a*b));
          }
      }

    public class InterfaceDemo1
    {
        public static void main(String [] args)
        {
              Abc obj = new Abc();

              Addition a = obj;
               a.add(10, 20);

              Multiplication m = obj;
                 m.mul(2, 3);
        } 
    }
