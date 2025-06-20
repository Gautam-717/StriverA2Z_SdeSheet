package BinarySearch._1easy;

public class _1_Find_X_In_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(BinarySearch(arr, 9));

        int[]nums={101,104,106,110};
        System.out.println(recusriveBinary(nums,0,nums.length-1,104));

    }
//  THIS ONE IS THE ITERATIVE APPROACH HERE WE ARE DIVIDING
//  THE ARRAY INTO TWO HALVES SO THE TIME COMPLEXITY WILL
//  BE 2^X=N ->X=LOGN(BASE2) THEREFORE THE TIME COMPLEXITY
//  WILL BE O(LOGN) WHERE N IS THE SIZE OF THE ARRAY

    public static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


//  RECURSIVE APPROACH
    //TIME COMPLEXITY WILL BE O(LOGN)

    public static int recusriveBinary(int[] arr, int start, int end, int target) {
        if(arr==null ||start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (target > arr[mid]) {
            return recusriveBinary(arr, mid + 1, end, target);
        } else {
            return recusriveBinary(arr, start, mid - 1, target);
        }
    }
}
