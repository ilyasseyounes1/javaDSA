public class Sorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,6,45,54};
        System.out.println(IsSorted(arr, i));

    }
    static int i = 0 ;
    static boolean IsSorted (int [] arr , int i){
            if (i == arr.length-1) {
                return true ;
            }
            return  arr [i] <= arr [i+1] && IsSorted(arr, i+1);
        }
    }
    
