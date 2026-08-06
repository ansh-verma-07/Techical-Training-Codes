/*
 "Run-Time Polymorphism"

 Object of type super-class can take memory of its sub-class instance 
 at run-time but, it can call only those members which are present in its
 super-class.
*/

      class Car
      {
          public void start()
          {
              System.out.println("\n class Car");
          }
      } 

      class BMW extends Car
      {
          public void start()
          {
              System.out.println("\n BMW Car");
          }

          public void fly()
          {
              System.out.println("\n fly() in BMW Car");
          }
      } 

      class AUDI extends Car
      {
          public void start()
          {
              System.out.println("\n AUDI Car");
          }
      } 

    public class RTP
    {
        public static void main(String [] args)
        {
            Car c;

            c = new BMW();
            c.start();
            c.fly();
 
 
            c = new AUDI();
            c.start();
        } 
    }
