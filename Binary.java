public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = BS(arr, target);
        System.out.println("Target found at index: " + result);
    }

    static int BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }
        return -1; 
    }
}