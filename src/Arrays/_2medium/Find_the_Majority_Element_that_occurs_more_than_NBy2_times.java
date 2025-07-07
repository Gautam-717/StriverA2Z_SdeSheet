package Arrays._2medium;

public class Find_the_Majority_Element_that_occurs_more_than_NBy2_times {
    public static void main(String[] args) {
        //int []nums = {4,4,2,4,3,4,4,3,2,4};
        int[] nums2  = {2,2,1,1,1,2,2};
        System.out.println(Majority_Element(nums2));
    }
    public static int Majority_Element(int[] arr){

        for (int j : arr) {
            int count = 0;
            for (int k : arr) {
                if (k == j) {
                    count++;
                }
                if (count >= arr.length / 2) {
                    return j;
                }

            }

        }
        return -1;
    }
}
