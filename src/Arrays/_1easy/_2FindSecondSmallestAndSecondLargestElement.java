package Arrays._1easy;

public class _2FindSecondSmallestAndSecondLargestElement {
    public static void main(String[] args) {
        // int[]arr={1,2,4,7,7,5};
        //int n=arr.length;
        int[]arr2={1};
        int n1=arr2.length;
        System.out.println("Second Largest"+" "+SecondLargest(arr2,n1)+" "+" "+"Second Smallest"+" "+SecondSmallest(arr2,n1));

    }
    public static int SecondSmallest(int[]arr,int n){
        if(n==0 ||n==1){
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            small=Math.min(arr[i],small);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
        }
        return second_small;
    }public static int SecondLargest(int[]arr,int n){
        if(n==0 ||n==1){
            return -1;
        }
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            large=Math.max(arr[i],large);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }
        return second_large;
    }
}
