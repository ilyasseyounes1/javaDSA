public class Pattern {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("---------------------");
        pattern2(5);
        System.out.println("----------------------");
        pattern3(5);
        System.out.println("----------------------");
        pattern4(5);
        System.out.println("----------------------");
        pattern5(5);
        System.out.println("-----------------------");
        pattern6(5);
        System.out.println("------------------------");
        pattern7(5);
        System.out.println("-----------------------");
        pattern8(6);
        System.out.println("------------------------");
        pattern9(5);
    }

    static void pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern4(int n) {
        pattern1(n);
        pattern3(n);
    }

    static void pattern5(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalClosInRow2 = row > n ? n * 2 - row : row;

            int numOfSpaces = n - totalClosInRow2;
            for (int s = 0; s < numOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalClosInRow2; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {

            int NOfsapaces = n - row;
            for (int S = 0; S < NOfsapaces; S++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern8(int n) {
        for (int row = 1; row < n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");

            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);

            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row < n * 2; row++) {

            int c = row > n ? n * 2 - row : row;

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }

    }

}
