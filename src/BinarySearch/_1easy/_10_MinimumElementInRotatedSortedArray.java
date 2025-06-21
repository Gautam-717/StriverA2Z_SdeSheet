package BinarySearch._1easy;

public class _10_MinimumElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(Minimum(arr));
    }

    public static int Minimum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = start + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
}
