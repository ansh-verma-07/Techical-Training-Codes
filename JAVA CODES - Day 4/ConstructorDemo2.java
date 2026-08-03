/*
      "Constructor in JAVA"
 
 1] It is a special method with same name as class name.
 2] It has no return type. Not even void.
 3] When we create an object of class constructor gets called automatically.
 4] It allocates memory for an object.
 5] It is used to initialize data members in class.
-----------------------------------------------------------------------------
NOTE - If there is no constructor present in class then JVM will provide you 
       default constructor.
       But, if there is parameterised constrcutor present in class then 
       No default constructor is provided.
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

//           new Abc(1000, 2000).show();
        } 
    }
