package BinarySearch._1easy;

public class _2_ImplementLowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        System.out.println(LowerBound(arr, 9));
    }

    public static int LowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result=arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                result=mid;
                end=mid-1;
            }else {
                start = mid + 1;
            }
        }
        return result;
    }
}
