package Arrays._1easy;

public class _4RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int k = RemoveDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int RemoveDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
