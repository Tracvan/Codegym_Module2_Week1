import javax.naming.PartialResultException;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, -7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The min in array is: " + arr[index]);
    }
    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
