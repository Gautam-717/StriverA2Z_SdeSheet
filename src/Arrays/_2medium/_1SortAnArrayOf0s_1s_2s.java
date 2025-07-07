package Arrays._2medium;

import java.util.Arrays;

public class _1SortAnArrayOf0s_1s_2s {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sort(nums)));
    }

    public static int[] sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid<=high){
            if (arr[mid] == 0) {
                swap(arr,low,mid);
                low++;
                mid++;
            }
            if (arr[mid] == 2) {
                swap(arr,high,mid);
                high--;
            }
            else{
                mid++;
            }
        }
        return arr;
    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
