
public class HCF {
    public static void main(String[] args) {
        int n=81;
        int m=72;
        System.out.println(fans(n,m));

    }
    public static int fans(int n,int m){
        int ans=1;
        for(int i=2;i<n;i++){
            if(n%i==0 && m%i==0){
                if(i<n||i<m){

                    ans=i;
                }
            }
        }
        return ans;
    }
    
}
