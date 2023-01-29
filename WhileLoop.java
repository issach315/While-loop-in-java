package While_Loop;

public class WhileLoop 
{
    public static void main(String[] args)
     {

     /*   while (condition)
        {
         
           
            ---------------
            ---------------
            --operation's--
            ---------------
            ---------------
           
        }
     */
        
         int num= 1;

        while (num <= 10)       // while loop condition  
        {
            System.out.println(num);        // printing statement

           num++;       //incremental operator
        }
        
        /*
        1.  if condition true only the jvm will enter into the loop
        2. and after the printing the statement  the preIncremental operator will increse the num value an dhelp for next iterartion
        */
        
    }
    
}
