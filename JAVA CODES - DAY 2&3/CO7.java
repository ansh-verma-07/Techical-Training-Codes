
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

    public class CO7
    {
        public static void main(String [] args)
        {
              Student s1 = new Student();
                s1.getDetails();
                s1.printDetails();  

              Student s2 = new Student();
                s2.getDetails();
                s2.printDetails();  
        }
    }
