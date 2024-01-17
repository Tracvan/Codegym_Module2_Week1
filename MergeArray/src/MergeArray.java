import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        System.out.println("Enter size of first array: ");
        size1 = scanner.nextInt();
        int[] arr1;
        arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter element'value at index" + (i + 1) + ":");
            arr1[i] = scanner.nextInt();
        }
        int size2;
        System.out.println("Enter size of second array: ");
        size2 = scanner.nextInt();
        int[] arr2;
        arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter element'value at index" + (i + 1) + ":");
            arr2[i] = scanner.nextInt();
        }
        int size3;
        size3 = size1 + size2;
        int[] arr3;
        arr3 = new int[size3];
        int[] result = merge(arr1, arr2, arr3);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.print("Merged array: ");
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] merge(int[] arr1, int[] arr2, int[] arr3) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = arr1.length; j < arr3.length;) {
            for (int i = 0 ; i < arr2.length;i++) {
                arr3[j] = arr2[i];
                j++;
            }
        }
        return arr3;
    }
}

