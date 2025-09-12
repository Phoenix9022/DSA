import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        int[] Arr = {3,5,4,6,7};
        bubble(Arr,Arr.length,0);
        System.out.println(Arrays.toString(Arr));
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