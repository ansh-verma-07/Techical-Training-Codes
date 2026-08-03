/*
          "Constructor in JAVA" 
 
 1] It is a special method with same name as class name.
 2] It has no return type. Not even void.
 3] When we create an object of class constructor gets called automatically.
 4] It allocates memory for an object.
 5] It is used to initialize data members in class.      
*/

       class Abc
       {
            int a, b;
 
           public Abc()
           {
               a = 10;
               b = 20; 
           }  

           public void show()
           {
               System.out.println("\n a = "+a);
               System.out.println("\n b = "+b);  
           }
       }

    public class ConstructorDemo
    {
        public static void main(String [] args)
        {
             Abc A = new Abc();
                 A.show();

             Abc B = new Abc();
                 B.show();
        } 
    }

