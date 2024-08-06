public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9,};
        int target = 8;
        System.out.println(Search(arr, target, 0, arr.length - 1));

    }
        // Binary Search Using Recursin : ******************

    static int Search(int[] arr, int target, int S, int E) {
        if (S > E) {
            return -1;
        }
        int m = S + (E - S) / 2;

        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return Search(arr, target, S, m - 1);
        }
        if (target > arr[m]) {
            return Search(arr, target, m + 1, E);
        }
        return -1;

    }
}
