
             import java.io.*;
  
       class Employee implements Serializable
       {
              String ename;
              int eid;

            public Employee(String ename, int eid)
            {
                this.ename = ename;
                this.eid = eid;
            }  

            public void show()
            {
                System.out.println("\n Ename = "+ename);
                System.out.println("\n Eid = "+eid);
            }
       }
 
    public class FileDemo3
    {
        public static void main(String [] args)
        {
            Employee e1 = new Employee("ABC", 101);

           System.out.println("\n Before Serialization : ");
                e1.show();

              FileOutputStream fos = null;
              FileInputStream fis = null;

              ObjectOutputStream oos = null;
              ObjectInputStream ois = null;
             
             try
             {
                fos = new FileOutputStream("employee.txt");
                oos = new ObjectOutputStream(fos);

                    oos.writeObject(e1); 

                       oos.close();
                       fos.close();
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }

             try
             {
                 fis = new FileInputStream("employee.txt");
                 ois = new ObjectInputStream(fis);

              Employee e2 = (Employee)ois.readObject();

                       ois.close();
                       fis.close();

              System.out.println("\n After Serialization : ");
                        e2.show();
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }
         }
    }
