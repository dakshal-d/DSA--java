

class MO{
    static int add(int a, int b){
        return a+b;
    } 
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }
    
}
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(MO.add(10,20));
        System.out.println(MO.add(10,20,30));
        System.out.println(MO.add(10.2,20.4,30.1));
    }
    
}
// compile time polymorphism