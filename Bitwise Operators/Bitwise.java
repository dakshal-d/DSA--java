public class Bitwise {
    public static void main(String[] args) {
        int x=3;
        int y=11;
        int leftshift= y<<x;
        int rightshift= y>>x;
        int OR= x|y;
        int AND=x&y;
        int complement= ~x+~y;// ~x=-4, ~y=-12
        System.out.println("LeftShift : "+leftshift);
        System.out.println("RightShift : "+rightshift);
        System.out.println("OR :"+OR);
        System.out.println("AND : "+AND);
        System.out.println("Complement : "+ complement);
    }
    
}
