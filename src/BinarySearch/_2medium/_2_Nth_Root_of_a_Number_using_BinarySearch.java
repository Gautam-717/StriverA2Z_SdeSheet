package BinarySearch._2medium;

public class _2_Nth_Root_of_a_Number_using_BinarySearch {
    public static void main(String[] args) {
        System.out.println(NthSquareRoot(3,27));
    }
    public static int NthSquareRoot(double n,int m){
        int start=0;
        int end= m;
        int root;
        while(start<=end){
            int mid=start+(end-start)/2;
            double val=Math.pow(mid,n);
            if(val==m){
                root=mid;
                return root;
            } else if (val>m) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
