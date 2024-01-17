import java.util.Arrays;
import java.util.Scanner;

public class AddElementAtMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int number;
        int index;
        System.out.println("Enter number need to add: ");
        number = scanner.nextInt();
        System.out.println("Enter index need to add");
        index = scanner.nextInt();
        int[] result = add(arr,number,index);
        System.out.println(Arrays.toString(result));

    }
    public static int[] add(int[]arr, int number, int index){
        int[] newArray;
        newArray = new int[arr.length+1];
        newArray[index] = number;

        for (int i=0; i<arr.length; i++){
            if(i<index){
                newArray[i] = arr[i];
            }else{
                newArray[i+1] = arr[i];
            }
        }
        return newArray;
    }
}
