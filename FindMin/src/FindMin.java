import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Enter element value at index " + i);
            arr[i] = scanner.nextInt();
        }
        int result = findMin(arr);
        System.out.println("The min element in array is  " + result);
    }
    public static int findMin( int[]arr){
        int min = arr[0];
        for ( int i =0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
