import java.util.Scanner;

public class SmallestinUnsortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        answer(arr,n,m);

        

    }
    public static void answer(int[] arr,int n,int m){
        int ans=Integer.MAX_VALUE;       
        for(int j=0;j<n;j++){
            while(m!=0){
            
                if(arr[j]<ans){
                    ans=arr[j];
                    m--;
                    break;

                }
            }
        }
        System.out.println(ans);

    }

    
}
