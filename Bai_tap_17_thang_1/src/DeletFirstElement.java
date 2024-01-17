import java.util.Arrays;
import java.util.Scanner;

public class DeletFirstElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        System.out.println("Enter number of array's size");
        int size = scanner.nextInt();
        arr = new int[size];
        for( int i =0; i < arr.length; i++) {
            System.out.println("Enter value of array's element at :" +i );
            arr[i] = scanner.nextInt();
        }
        int[] result = delete(arr);
        System.out.println(Arrays.toString(result));


    }
    public static int[] delete(int[]arr){
        int[] newArr;
        newArr = new int[arr.length-1];
        for( int i =0; i< newArr.length;i++){
            newArr[i] = arr[i+1];
        }
        return newArr;
    }
}
