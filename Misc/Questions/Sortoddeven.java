import java.util.*;

public class Sortoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int result[]=sort(arr, n);
        for(int num:result){
            System.out.print(num+" ");
        }
        
    }
    public static int[] sort(int arr[],int n){
        int even=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) even++;
        }
        int evenarr[]=new int[even];
        int oddarr[]=new int[arr.length-even];
        int answer[]=new int[arr.length];
        int i=0;
        int k=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]%2==0){
                evenarr[i]=arr[j];
                i++;
            } else{
                oddarr[k]=arr[j];
                k++;
            }
        }
        i=0;
        for (int j = 0; j < evenarr.length; j++) {
            answer[j]=evenarr[j];
            i++;
        }
        for (int j = 0; j < oddarr.length; j++) {
            answer[i]=oddarr[j];
            i++;
        }
        return answer;
    }
    
}
