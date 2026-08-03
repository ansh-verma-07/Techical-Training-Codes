/*
      Q] switch case with character
            a,e,i,o,u => vowel

        "Silent fall through in switch case" 
*/ 

       import java.util.Scanner;

    public class SwitchDemo2
    {
        public static void main(String [] args)
        {
            Scanner s = new Scanner(System.in);   

           System.out.println("\n Enter a char : ");
              char ch = s.next().charAt(0);
                    
              switch(ch)
              {
                  case 'a':
                  case 'e':
                  case 'i':
                  case 'o':
                  case 'u':
                  case 'A':
                  case 'E':
                  case 'I':
                  case 'O':
                  case 'U':
                            System.out.println("\n VOWEL ");
                                 break;
                  default :
                            System.out.println("\n NOT VOWEL ");
              }
        } 
    }
