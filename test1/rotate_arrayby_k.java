package test1;
import java.util.*;

class rotate_arrayby_k {
    public static void main(String[] args) {
        System.out.println("Enter K");
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        k = k % n; 

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
        
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }    
}
