public class Recursion {

    public static void main(String[] args) {
        int n = 10;
        long result = fibonacci(n);
        System.out.println(result);
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
