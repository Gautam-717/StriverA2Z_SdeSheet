package BinarySearch._1easy;

public class _9_SearchElementsInRotatedSearchArrayII {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3,3,3,3};
        System.out.println(SearchInSortedarray(arr,2));
    }

    public static boolean SearchInSortedarray(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return true;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            }
            if (arr[start] <= arr[mid]) {
                if (k >= arr[start] && k <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (k >= arr[mid] && k <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}

