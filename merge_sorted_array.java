import java.util.Scanner;

public class merge_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) ar[i] = sc.nextInt();


        int m = sc.nextInt();
        int[] br = new int[m];
        for (int i = 0; i < m; i++) br[i] = sc.nextInt();

        int[] cr = new int[n + m];
        
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (ar[i] <= br[j]) {
                cr[k++] = ar[i++];
            } else {
                cr[k++] = br[j++];
            }
        }

       
        while (i < n) {
            cr[k++] = ar[i++];
        }

       
        while (j < m) {
            cr[k++] = br[j++];
        }

        for (int x : cr) {
            System.out.print(x + " ");
        }
        
        sc.close();
    }
}
