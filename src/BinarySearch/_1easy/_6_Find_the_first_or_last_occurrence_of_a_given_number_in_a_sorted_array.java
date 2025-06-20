package BinarySearch._1easy;

import java.util.Arrays;

public class _6_Find_the_first_or_last_occurrence_of_a_given_number_in_a_sorted_array {
    public static void main(String[] args) {
       int[] array = {3,4,13,13,13,20,40};
        System.out.println(Arrays.toString(range(array,13)));
    }
    public static int[] range(int[]arr,int element){
        int[] ans={-1,-1};
        ans[0]=occurence(arr,element,true);
        if(ans[0]!=-1){
            ans[1]=occurence(arr,element,false);
        }
        return ans;
    }
    public static int occurence(int[]arr,int target,boolean ispresent){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else{
                ans=mid;
                if(ispresent){
                    end=mid-1; // To check in the left
                }else{
                    start=mid+1;  //To check in the right
                }
            }
        }
        return ans;
    }
}
