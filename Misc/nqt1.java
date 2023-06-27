package Misc;

import java.util.*;

public class nqt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }

    static void ans(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                st.push(arr[i]);
            }
        }

    }
}
