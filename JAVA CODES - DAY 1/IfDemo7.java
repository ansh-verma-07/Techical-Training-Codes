/*
         year = 2000  LEAP YEAR
         year = 2001  NOT A LEAP YEAR
----------------------------------------------------------

        units <= 100  =>  per unit Rs.1 charge
        units <= 200  =>  per unit Rs.2 charge
        units > 200  =>   per unit Rs.3 charge
        
          units = 250

            100
          + 200
          + 150
        ----------
            450     

*/

         import java.util.*;

     public class IfDemo7
     {
         public static void main(String [] args)
         {
              Scanner s = new Scanner(System.in);
                  int units, amount=0;

              System.out.println("\n Enter units : ");
                  units = s.nextInt();

           if(units <= 100)
           {
               amount = amount + units;
           } 
           else if(units <= 200)
           {
               amount = 100 + (units-100)*2;  
           }
           else 
           {
               amount = 300 + (units-200)*3;  
           }

           System.out.println("\n Amount = "+amount);                      

                   amount = 0;

              System.out.println("\n Enter units : ");
                  units = s.nextInt();

           if(units > 200)
           {
                amount = amount + (units-200)*3;
                    units = 200;
           }
           if(units > 100)
           {
                amount = amount + (units-100)*2;
                    units = 100;
           }
           if(units <= 100)
           {
                amount = amount + units;
           } 

           System.out.println("\n Amount = "+amount);                      
         }
     }




