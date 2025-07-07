package Arrays._1easy;

public class _1Find_The_Largest_Element_In_The_Array {
    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 7, 9};
        System.out.println(Largest(arr));
    }

    public static int Largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}

