/*
      METHOD WITH VARIABLE ARGUMENTS
*/
 
      class Abc
      { 
          public void show(int ... x)
          {
              System.out.println("\n LIST : ");
              for(int i=0 ; i<x.length ; i++)
              {
                 System.out.print("  "+x[i]);
              }
          }  
      } 

    public class CO5
    {
        public static void main(String [] args)
        {
              Abc obj = new Abc();

              obj.show(10,20);
              obj.show();
              obj.show(11,22,33);
              obj.show(1,2,3,4,5);
        }
    }
