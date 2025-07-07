package Arrays._1easy;

import java.util.Arrays;

public class _2LeftRotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(nums,1)));
    }
        public static int[] rotate(int[] nums, int k) {
            while(k>0){
                //int n=nums.length;
                for(int i=0;i<nums.length-1;i++){
                    swap(nums,i+1,i);
                }
                k--;
                nums[0]=nums[nums.length-1];
            }
            return nums;
        }
        public static void swap(int[]arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

