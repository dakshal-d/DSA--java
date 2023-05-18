import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
    
        int n =in.nextInt();
        if(n%2 == 0)
            System.out.println("even");

        else
            System.out.println("odd");
    }
    
}
