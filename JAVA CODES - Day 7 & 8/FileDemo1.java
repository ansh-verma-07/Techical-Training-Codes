/*
     File Handling in Java
-------------------------------------------------------------------
         java.io
   
     "String data" 
     FileOutputStream => write
     FileInputStream => read

      "Binary Files"
      ObjectOutputStream => binary write
      ObjectInputStream => binary read
*/ 

      import java.util.*;
      import java.io.*;

    public class FileDemo1
    {
        public static void main(String [] args)
        {
             Scanner s = new Scanner(System.in);

            System.out.println("\n Enter data in file : ");
              String str = s.nextLine();

              FileOutputStream fos = null;
              FileInputStream fis = null;
             
            try
            {                
                fos = new FileOutputStream("data.txt");
    
                 for(int i=0; i<str.length(); i++)
                 {
                     fos.write(str.charAt(i));   
                 }
      
                      fos.close();
            }
            catch(Exception e)
            {
               System.out.println(e); 
            }

            try
            {
                File f = new File("data.txt");
                fis = new FileInputStream(f);

                int size = fis.available();

              System.out.println("\n Data From File : ");  
               for(int i=0 ; i<size ; i++)
               {
                    char ch = (char)fis.read();                  
                      System.out.print(ch);
               } 

                     fis.close();
            }
            catch(Exception e)
            {
                System.out.println(e);   
            }
        }
    }

