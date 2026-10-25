public class armstrong{
    public static void main(String[] args){
        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int digits = 0;
            int sum = 0;
            int n = num;
            while (n > 0) {
                digits++;
                n /= 10;
            }
            
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int i = 1; i <= digits; i++) {
                    power *= digit;
                }
                sum += power;
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }   
}