package BinarySearch._1easy;

public class _13_Peak_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        System.out.println(PeakElement(arr));

    }

    public static int PeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) { //Ascending Case
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return end;
    }
}
