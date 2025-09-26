import java.util.Arrays;
import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: " + Arrays.toString(Arr));
        bubble(Arr,Arr.length,0);
        System.out.println("Array after sorting: " + Arrays.toString(Arr));
    }
    
    static void bubble(int[] Arr,int length ,int index){
        if (length == 0){
            return;
        }
        if (index < length-1){
            if (Arr[index] > Arr[index+1]){
                int temp = Arr[index];
                Arr[index] = Arr[index + 1];
                Arr[index + 1]=temp;
            }
            bubble(Arr, length, index+1);
        } else{
            bubble(Arr, length-1, 0);
        }
    }
}