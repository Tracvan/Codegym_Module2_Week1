import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementAtIndex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter number of array'size");
        int size = scanner.nextInt();
        arr = new int[size];
        for( int i = 0; i<size; i++){
            System.out.println("Enter value of element " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter number of index need to delete");
        int index = scanner.nextInt();
        int[]result = delete(arr,index);
        System.out.println(Arrays.toString(result));
    }
    public static int[] delete(int[] arr, int index){
        int[] newArr;
        newArr = new int[arr.length-1];
        for( int i=0; i<newArr.length;i++){
            if(i<index){
                newArr[i] = arr[i];
            }else {
                newArr[i] = arr[i+1];
            }
        }
        return newArr;
    }
}
