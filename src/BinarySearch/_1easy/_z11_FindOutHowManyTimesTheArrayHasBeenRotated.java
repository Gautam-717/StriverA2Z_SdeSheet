package BinarySearch._1easy;

public class _z11_FindOutHowManyTimesTheArrayHasBeenRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(noOfRotatinOfArray(arr));
    }
    public static int noOfRotatinOfArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end]){
                start=start+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
}
