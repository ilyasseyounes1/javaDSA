public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibo(44));
    }

    static int Fibo(int n) {
        // Base condition :
        if (n < 2) {
            return n;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }

}
