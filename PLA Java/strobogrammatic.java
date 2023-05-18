import java.util.Scanner;

public class strobogrammatic {
    public static void stbg_no(int n){

        if(n>0) {
                int x;
                x=n%10;
                n = n / 10;
                if (x == 2 || x == 3 || x == 4 || x == 5 || x == 7) {
                    System.exit(0);
                    System.out.print("Not a strobogrammatic number ");

//                return -1;
                } else if (x == 6) {
                    System.out.print("9");
//                return 9;
                } else if (x == 9) {
                    System.out.print("6");
//                return 6;
                } else {
                    System.out.print(x);
//                return x;
                }
            stbg_no(n);
        }else{
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s=(""+n);
        if(s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("7") ){
            System.out.println("The number is not a strobogrammatic number!");
        }else{
            stbg_no(n);
            System.out.println("The no is a strobogrammatic number ");

        }

    }
}