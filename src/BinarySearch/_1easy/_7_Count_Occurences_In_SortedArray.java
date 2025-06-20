package BinarySearch._1easy;

public class _7_Count_Occurences_In_SortedArray {
    public static void main(String[] args) {
        int[] array = {2, 2 , 3 , 3 , 3 , 3 , 4};
        System.out.println(totalOccurence(array,2));
    }
    public static int totalOccurence(int[]arr,int element){
        int[] ans ={-1,-1};
        ans[0]= FirstAndLastOccurence(arr,element,true);
        if(ans[0]!=-1){
            ans[1]= FirstAndLastOccurence(arr,element,false);
        }
        return (ans[1]-ans[0])+1;
    }
    public static int FirstAndLastOccurence(int[]arr, int target, boolean ispresent){
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
