public class concept {
    public static void main(String[] args) {
        fun (5);
    }
    static void fun (int n ){
        if (n == 0){
            return;
        }
        System.out.println(n);
        // fun (n--);  past n then sabtract -1
        fun (--n);    // sabtract "-1" then past n 
    }

}
