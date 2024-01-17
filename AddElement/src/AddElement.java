import javax.naming.PartialResultException;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array is: arr =1,2,3,4,5,6,0,0,0,0");
        int number;
        System.out.println("Enter number want to add");
        number = scanner.nextInt();
        int index;
        System.out.println("Enter number of index:");
        index = scanner.nextInt();
        if(index<0 || index> arr.length){
            System.out.println("Index is not defined");
            System.exit(0);
        }
        int[] result = add(arr, number, index);
        System.out.println("New array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
    public static int[] add(int[] arr, int number, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
            for (int j = i; j > index;j-- ) {
                    arr[j] = arr[j - 1];
                }
            }
            arr[index-1] = number;
            break;
        }

        return arr;
    }
}

