/*
      Array object of a class
*/

         import java.util.Scanner;

      class Student
      {
           String name;
           int rollno;
           int marks;

          public void getDetails()
          {
              Scanner s = new Scanner(System.in);

              System.out.println("\n Enter Name : ");
                 name = s.nextLine();

              System.out.println(" Enter Rollno : ");
                 rollno = s.nextInt();

              System.out.println(" Enter Marks : ");
                 marks = s.nextInt();
          }           

          public void printDetails()
          {
              System.out.println("\n Name = "+name);
              System.out.println(" Rollno = "+rollno);
              System.out.println(" Marks = "+marks);
          }
      }

    public class CO8
    {
        public static void main(String [] args)
        {
             Student [] s = new Student[3];
                 int i;

               for(i=0 ; i<3 ; i++)
               {
                   s[i] = new Student();
                   s[i].getDetails();
               }

               for(i=0 ; i<3 ; i++)
               {
                   if(s[i].marks >= 100)
                   {
                       s[i].printDetails();
                   }
               }
        }
    }


