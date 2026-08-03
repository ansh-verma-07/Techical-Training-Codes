/*
      Static Variables in JAVA

 1] They are declared using keyword static.
 2] Its default value is zero.
 3] Only one memory is allocated for static variable. 
    No separate memory for every objcet.
 4] They are class members not object members. 
----------------------------------------------------------------------
      Static Methods in JAVA

 1] They are declared using keyword static.
 2] It can access only other static members of class.
 3] It can be called using class-name directly.
 4] They are class members not object members. 
*/

      class Abc
      {
          int x;
          static int count;

          public Abc(int a)
          {
              x = a;
              count++;   
          }

          public void show()
          {
              System.out.println("\n x = "+x);
              System.out.println(" count = "+count);  
          } 

          public static void display()
          {
              System.out.println(" count = "+count);  
          }
      }

    public class StaticDemo
    {
        public static void main(String [] args)
        {
               Abc A = new Abc(100);
                   A.show();  

               Abc B = new Abc(200);
                   B.show();  

               Abc C = new Abc(300);
                   C.show();  

             System.out.println("\n------------");
                  Abc.display();
        } 
    }

/*
           A         B         C
          x=100     x=200     x=300

                  count=3
*/





