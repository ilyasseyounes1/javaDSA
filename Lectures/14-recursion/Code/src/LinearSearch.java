public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 21, 3, 5, 18, 55 };
        int target = 32;
        int i = 0;
        System.out.println( Search(arr, target, i));
        System.out.println(findindex(arr, target, i));
    }

        //*********************************************** ******
    static boolean Search(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false ;
        }
        return target == arr[i] || Search(arr, target, i + 1);
    }
        // ********************************************************
    static int findindex (int [] arr , int target , int i) {
        if (i == arr.length) {
             return -1 ;
        }
        if ( arr [i] == target) {
            return i;
        }
        else {
            return findindex(arr, target, i+1);
        }
    }

}
