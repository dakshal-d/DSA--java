public class fibonacci {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fib(n-1));

        
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1|| n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    
}
