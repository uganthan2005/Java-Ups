public class method {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
    public static int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 3;

       
        int sum = add(x, y);
        int difference = sub(x, y);
        int product = mul(x, y);
        double quotient = div(x, y); 
        int remainder = mod(x, y);

        System.out.println("Addition (10 + 3): " + sum);
        System.out.println("Subtraction (10 - 3): " + difference);
        System.out.println("Multiplication (10 * 3): " + product);
        System.out.println("Division (10 / 3): " + quotient);
        System.out.println("Modulo (10 % 3): " + remainder);
    }
}
