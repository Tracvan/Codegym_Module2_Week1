import java.util.Arrays;
import java.util.Scanner;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number size of rows: ");
        int sizeRows = scanner.nextInt();
        System.out.println("Enter number size of columns: ");
        int sizeColumns = scanner.nextInt();
        int[][] arr = new int[sizeRows][sizeColumns];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Input value of arr[" + i + "][" + j + "]" );
                arr[i][j]= scanner.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int result = sum(arr);
        System.out.println("sum of Main Diagonal is: " + result);

    }
    public static int sum(int[][]arr){
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            sum += arr[i][i];
        }
        return sum;
    }
}
