import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Additional numbers
        System.out.print("Enter the number of numbers: ");
        int n = scanner.nextInt();
        int[] Numbers = new int[n];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            Numbers[i] = scanner.nextInt();
        }

        // Find minimum increment for each additional number
        for (int i = 0; i < n; i++) {
            int number = Numbers[i];
            number++;
            while(containsNumber(array, number)){          
            number++;
            }

            Numbers[i] = number;
        }
        // Print the updated additional numbers
        System.out.println("Updated additional numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Numbers[i]);
        }
    }
    // Helper method to check if a number is present in the array
    private static boolean containsNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}

