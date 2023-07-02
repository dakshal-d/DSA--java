import java.util.*;

public class nqt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ans(arr, n);
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]);
        }

    }

    static void ans(int[] arr, int n) {
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                // count++;
                arr[count]=arr[i];
                count++;
            }
        }
        for(int j=count;j<n;j++){
            arr[j]=0;
        }
        // for (int k = 0; k < n; k++) {
        //     System.out.print(arr[k]);
        // }
        

    }
}
