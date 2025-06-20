package BinarySearch._1easy;

public class _4_SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        System.out.println(SearchInsertposition(arr,6));
    }
        public static int SearchInsertposition(int[] arr, int target) {
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
