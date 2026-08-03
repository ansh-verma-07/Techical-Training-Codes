/*
           Constructor in JAVA

 1] Constructor is special method with same name as class-name
 2] It has no return type. Not even void. 
 3] When we create an object of class constructor gets called automatically.  
 4] It allocates memory for an object.
 5] It is used to initialize data members in class.
*/

       class Abc
       {
             int a, b;

           public Abc()  // Default Cons
           {
               a = 10;
               b = 20;
           }

           public Abc(int x, int y)  // Parameterised Cons
           {
               a = x;
               b = y;
           }

           public void show()
           {
                System.out.println("\n a = "+a);
                System.out.println("\n b = "+b);
           }
       } 
 
    public class ConstructorDemo2
    {
        public static void main(String [] args)
        {
              Abc A = new Abc();
                  A.show();

              Abc B = new Abc(11, 22);
                  B.show();

              Abc C = new Abc(100, 200);
                  C.show();

              new Abc(1000, 2000).show();
        }
    }








