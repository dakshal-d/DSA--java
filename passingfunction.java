import java.util.Arrays;
import java.util.Scanner;


public class passingfunction {
    public static void main(String[] args) {
    //     int[] Nums={1,2,3};
    //     System.out.println(Arrays.toString(Nums));
    //     change(Nums);
    //     System.out.println(Arrays.toString(Nums));
    // }
    // static void change(int[ ]  arr){
    //     arr[0]=99;    
    // }

    Scanner in= new Scanner(System.in);
    int [][] arr= new int[3][3];
    System.out.println(arr.length);

    for(int row=0; row<arr.length;row++){
        for (int col=0; col< arr[row].length;col++){
            arr[row][col]=in.nextInt();
                System.out.print(arr[row][col]+" ");
        } 
        System.out.println();   

    }


} }
