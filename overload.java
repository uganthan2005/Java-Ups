public class overload {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        overload calculator = new overload();
        int sum1 = calculator.add(5, 10); 
        double sum2 = calculator.add(3.5, 2.5); 

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        main(new char[]{'a', 'b', 'c'});
    }
    public static void main(char[] args) {
        overload calculator = new overload();
        int sum1 = calculator.add(6, 10); 
        double sum2 = calculator.add(3.5, 2.5); 

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
    }
}
