package test1;
import java.util.*;

class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] count = new int[256]; 

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                continue;
            }
            count[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == ' ') {
                continue;
            }
            count[str2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("The strings are not anagrams.");
                return;
            }
        }

        System.out.println("The strings are anagrams.");
        sc.close();
    }
    
}
