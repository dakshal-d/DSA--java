//OrderAgnostic Binary Search
public class OrderAgnostic {
    
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target= 10;
        int ans= binaryS(arr, target);
        System.out.println("the position of the target element is: "+ans);

    }

    static int binaryS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isaasc;
        if (arr[start] < arr[end]) {
            isaasc = true;
        } else {
            isaasc = false;
        }

        while (start <= end) {

            // int mid= (start+end)/2;
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isaasc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }

                if (target < arr[mid]) {
                    end = mid - 1;
                }

            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                if (target > arr[mid]) {
                    end = mid - 1;
                }

            }

        }
        return -1;
    }
}
