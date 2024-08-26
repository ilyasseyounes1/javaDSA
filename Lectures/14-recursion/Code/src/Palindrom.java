public class Palindrom {
/*    static int k = 0 ;
    static boolean palin (int arr [] ,int s, int e ){
        if (arr [arr.length-1 /2] == arr [(arr.length-1 /2)+1] & s == e || arr [arr.length-1 /2] == s & s == e  ){
            return true ;
        }
        if (arr [s] == arr[e]){
            return palin (arr ,arr [k++],arr [arr.length-k]);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1};
        int s = arr [k];
        int e = arr [arr.length-k-1];
        System.out.println(palin(arr ,s , e));
    }*/ 
    static int n = 12321;
    public static void main(String[] args) {
        revNum(n) ;
        palin(n);
    }

    static int sum = 0;
    static void revNum (int n) {
     if ( n == 0 ) {
         return ;
     }
     int rem = n %10 ;
     sum = sum * 10 + rem;
     revNum(n/10);
    }
   static boolean palin (int n ) {
    return n == sum ; 
   }
}
