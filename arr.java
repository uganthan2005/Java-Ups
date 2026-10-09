import java.util.Scanner;

public class arr {

    // Calculates the minimum element in an array
    static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Calculates the maximum element in an array
    static int max(int[] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    // Finds the second smallest element in an array
    static int secondmin(int[] array){
        int min1=min(array);
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<secondmin && array[i]!=min1){
                secondmin=array[i];
            }
        }
        return secondmin;
    }

    // Finds the second largest element in an array
    static int secondmax(int[] array){
        int max1=max(array);
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>secondmax && array[i]!=max1){
                secondmax=array[i];
            }
        }
        return secondmax;
    }

    // Merges two hardcoded char arrays into one larger array
    static char[] createCharArray() {
        char[] a1 = {'a', 'b', 'c', 'd', 'e'};
        char[] a2= {'f', 'g', 'h', 'i', 'j'};
        char[] a3= new char[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            a3[a1.length + i] = a2[i];
        }
        return a3;
    }

    // Searches for a target value sequentially and returns its index
    static int linearsearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    // Finds indices of two elements that add up to a target sum
    static int[] twosum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Calculates the sum of all even numbers in an array
    static int printArray(int[] array) {
        int esum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                esum += array[i];
            }
        }
        return esum;
    }

    // Adds two 2D matrices element by element
    static int[][] addmatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] li={2,3,1,9,2,3,4,10};
        System.out.println(min(li));
        System.out.println(max(li));
        System.out.println(secondmin(li));
        System.out.println(secondmax(li));
        

        char[] a11 = createCharArray();
        for (char c : a11) {
            System.out.print(c + " ");
        }
        System.out.println(); // Added for clean line formatting

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }

        int a=linearsearch(arr, 5);
        System.out.println(a);

        int[] res = twosum(arr, 10);
        System.out.println(res[0] + ", " + res[1]);

        int[] arr1= new int[10];
        Scanner sc = new Scanner(System.in);
        

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        a=printArray(arr1);
        System.out.println(a);


        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for(int j=0 ;j<arr2[i].length; j++){
                System.out.println("Enter value for arr2["+i+"]["+j+"]:");
                arr2[i][j] = sc.nextInt(); 
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        int[][] result = addmatrix(arr2, arr2);
        for (int i = 0; i < result.length; i++) {
            for(int j=0; j<result[i].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
