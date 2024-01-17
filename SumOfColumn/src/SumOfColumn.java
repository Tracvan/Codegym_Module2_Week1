import java.util.Arrays;
import java.util.Scanner;

public class SumOfColumn {
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
        System.out.println("Enter number of column want to sum: ");
        int column = scanner.nextInt();
        int result = sumColumn(arr,column);
        System.out.println("Sum of column " + column +"is: " + result);

    }
    public static int sumColumn(int[][] arr,int column ) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column-1];
        }
        return sum;
    }
}

