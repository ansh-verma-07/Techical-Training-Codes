/*
       Multithreading in JAVA
------------------------------------------
          java.lang

      interface Runnable
      {
          public abstract void run();  
      }  

      class Thread implements Runnable
      {
          public void run()
          {
          }  

          public void start()
          {
              this.run(); 
          } 

            stop();
            sleep();
      }  
*/

      class A extends Thread
      { 
          public void run()
          {
              for(int i=1 ; i<=100 ; i++)
              {
                  System.out.println("\n i = "+i);

                try
                {
                   if(i == 50)
                   {
                       Thread.sleep(1000);
                   }
                }
                catch(Exception e)
                {}      
              } 
          }   
      }

      class B extends Thread
      { 
          public void run()
          {
              for(int j=1 ; j<=100 ; j++)
              {
                  System.out.println("\n j = "+j);
              } 
          }   
      }

    public class ThreadDemo1
    {
        public static void main(String [] args)
        {
             A a = new A();
             B b = new B();

           a.setPriority(Thread.MAX_PRIORITY); 
           b.setPriority(Thread.MIN_PRIORITY); 

              a.start();
              b.start(); 
        } 
    }



