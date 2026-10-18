import java.util.*;

class findduplicates {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean isAlreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isAlreadyPrinted = true;
                    break;
                }
            }
            
            if (isAlreadyPrinted) {
                continue;
            }
            
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; 
                }
            }
        }
        System.out.println();

    }    
}
