/*
      Method Overriding
      Redefining a method in sub-class.
*/

      class A
      {
          private void show()
          {
              System.out.println("\n show() of CLASS A ");
          }
      }

      class B extends A
      {
          public void show()
          {
              System.out.println("\n show() of CLASS B ");
                // super.show();
          }
      }

    public class MethodOverriding
    {
        public static void main(String [] args)
        {
              B obj = new B();
               // obj.show();
        } 
    }



/*
      class Car
      {
           public void start()
           {
                --------
                --------
                --------
           }
      }
           IS-A Relationship
      class BMW extends Car
      {
           public void start()
           {
                --------
                --------
                --------
                --------
                super.start();
                --------
                --------
                --------
                --------
                --------
           }
      }
 
           BMW obj = new BMW();
              obj.start();
*/

