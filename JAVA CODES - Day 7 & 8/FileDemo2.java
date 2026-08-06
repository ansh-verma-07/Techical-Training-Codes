
         import java.io.*;

    public class FileDemo2
    {
        public static void main(String [] args)
        {
            int [] x = {10,20,30,40,50};

            FileOutputStream fos = null;
            FileInputStream fis = null;
 
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
 
            try
            {
               fos = new FileOutputStream("numbers.txt");
               oos = new ObjectOutputStream(fos);

                 for(int i=0; i<x.length ; i++)
                 {
                     oos.writeInt(x[i]);
                 }

                   oos.close();
                   fos.close();
            }
            catch(Exception e)
            {
                System.out.println(e);   
            }

            try
            {
                fis = new FileInputStream("numbers.txt");
                ois = new ObjectInputStream(fis);

                int y [] = new int[5];

                for(int i=0 ; i<5; i++)
                {
                      y[i] = ois.readInt();

                   System.out.println("\n y = "+y[i]); 
                }

                     ois.close();
                     fis.close();
            }
            catch(Exception e)
            {
                System.out.println(e);   
            }
        }
    }

