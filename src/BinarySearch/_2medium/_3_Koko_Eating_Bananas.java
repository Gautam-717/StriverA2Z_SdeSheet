package BinarySearch._2medium;

public class _3_Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368};
        System.out.println(koko(arr, 1000000000));
    }
    // BruteForce Approach
//    public static int KokoEating(int[]arr,int hours){
//        if(arr.length==hours){
//            return Max(arr);
//        }
//        int count=1;
//
//        while(count<=hours){
//            int totaltime=0;
//            for (int j : arr) {
//                totaltime += (int) Math.ceil((double) j / count);
//            }
//            if(totaltime<=hours){
//                return count;
//
//            }
//            else{
//                count++;
//            }
//        }
//        return -1;
//    }

    private static int Max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int koko(int[] arr, int hours) {
        if (arr.length > hours) {
            return -1;
        }
        int low = 1;
        int high = Max(arr);
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totaltime = func(arr, mid);
            if (totaltime <= hours) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    private static int func(int[] arr, int mid) {
        int total = 0;
        for (int j : arr) {
            total += (j + mid - 1) / mid;
        }
        return total;
    }
}
