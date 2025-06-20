package BinarySearch._1easy;

public class _5_FloorAndCeil_In_SortedArray {
    public static void main(String[] args) {
        int[] arr ={3, 4, 4, 7, 8, 10};
        System.out.println(Floor(arr,8)+" "+Ceil(arr,8));
    }

    public static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];

    }

    public static int Ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];

    }
}
