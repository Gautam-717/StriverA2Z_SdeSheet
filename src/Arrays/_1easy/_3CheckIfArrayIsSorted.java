package Arrays._1easy;
public class _3CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(IsSorted(arr));
    }

    public static boolean IsSorted(int[] arr) {
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i+1]<arr[i]) {
                return false;
            }
        }
        return true;
    }

}
