import java.util.Arrays;
import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter the target element: ");
        int target = S1.nextInt();
        int result = LS(arr, target, 0);
        System.out.println(Arrays.toString(arr));
        System.out.println("Printed Array Is: " + result);
    }

    static int LS(int[] arr, int target, int index) {
        if (arr.length==0) {
            return -1; 
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1;
    }
}