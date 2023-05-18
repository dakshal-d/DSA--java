import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner sc = new Scanner(System.in); 
        int t= sc.nextInt();
        
        for (int i = 1; i <=t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for (int j = 1; j <= x; j++)   
            {   
            if (j%3==0 && j%5==0)   
            {     
            System.out.println("FizzBuzz");  
            }     
            else if (j%3==0)   
            {   
            System.out.println("Fizz");  
            }     
            else if (j%5==0)   
            {     
            System.out.println("Buzz");  
            }   
            else   
            {     
            System.out.println(j);  
            } 
            } 
            
            for (int k = 1; k <= y; k++)   
            {   
            if (k%3==0 && k%5==0)   
            {     
            System.out.println("FizzBuzz");  
            }     
            else if (k%3==0)   
            {   
            System.out.println("Fizz");  
            }     
            else if (k%5==0)   
            {     
            System.out.println("Buzz");  
            }   
            else   
            {     
            System.out.println(k);  
            } 
            } 
        }        
   
    }
}
