public class DigitProduct {
    public static void main(String[] args) {
        int ans1 = sum(1342);    
        System.out.println(ans1); 
        int ans2 = prod( 1245453);
        System.out.println(ans2);
    
    }


    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }

    static int prod(int n) {
        if (n%10 == n) { 
            return n;
        }
        return (n % 10) * prod(n / 10);
    }
}