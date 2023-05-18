import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the salary:");
        int salary= in.nextInt();
        System.out.println("Your salary is :"+ salary);


        if (salary>10000){
            salary = salary +2000;
        } else if (salary <= 1000  ){
            System.out.println("No bonus");
        }
         else  {
            salary = salary +1000;

        } 
        System.out.println("salary is "+salary);


         




        
    }
}