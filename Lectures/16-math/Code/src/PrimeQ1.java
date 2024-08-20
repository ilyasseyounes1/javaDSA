public class PrimeQ1 {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 1; i < n; i++) {
            if (isPrime(i) == true) {
                System.out.println(i + "is prime ");
            }
        }

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;

    }
}