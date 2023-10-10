import java.util.Scanner;

public class CheckPrimeDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(PrimeDiagonal(arr, n, m));
    }
    public static int PrimeDiagonal(int arr[][],int n,int m){
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j  && isPrime(arr[i][j]) ){
                    max=Math.max(max,arr[i][j]);
                }
                if(i+j==n-1 && isPrime(arr[i][j])){
                    max=Math.max(max,arr[i][j]);
                }

            }
        }
        return max;

    }
    public static boolean isPrime(int num){
        if(num==0||num==1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
