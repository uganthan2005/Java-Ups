package test1;
import java.util.*;
class non_repeating_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); ;
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                System.out.println("The first non-repeating character is: " + str.charAt(i));
                return;
            }
        }

        System.out.println("There are no non-repeating characters.");
        sc.close();
    }
    
    
}
