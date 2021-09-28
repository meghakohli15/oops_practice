//example
public class Main
{  
  public static void main(String args[])
  {  
   try{    
      int data=100/0;  
   }
   catch(ArithmeticException e)
   {
       System.out.println(e);
       
   }    
   System.out.println("code...");  
  }  
}  

example
import java.io.FileNotFoundException;  
import java.io.PrintWriter;  
  
public class Main {  
  
    public static void main(String[] args) {  
          
          
        PrintWriter pw;  
        try {  
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            pw.println("saved");  
        }  
// providing the checked exception handler  
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  
    }  
}  
