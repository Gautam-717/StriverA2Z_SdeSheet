package BinarySearch._2medium;

public class _1_FindingSqrtUsingBinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(30));
    }
    public static int binarySearch(int n){
        int start=0;
        int end=n;
        int root;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid*mid==n) {
                root = mid;
                return root;
            } else if (mid*mid>n) {
                end=mid-1;

            }else{
                start=mid+1;
            }
        }
        return start-1;
    }
}
