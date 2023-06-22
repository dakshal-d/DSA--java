public class Pattern1{
    public static void main(String[] args) {
        pat1(5);
        pattern2(4);
    }

    static void pattern2(int n) {
        int originalN = n;
        n = 2 * n-2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    static void pat1(int size){
    for (int i = 0; i < size; i++) {
      // print spaces
      for (int j = 0; j < size - i; j++) {
        System.out.print("  ");
      }
      // print stars
      for (int k = 0; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
    // loop to print the patt
        
}