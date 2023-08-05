public class PlusOne {
    public static void main(String[] args) {
        System.out.println(inc(5));

        
    }
    public static int inc(int n){
        if(n==0){
            return n;
        }else{
            return n+inc(n-1);
        }        
    }  
// -----------------------------------------------------------------

}

    