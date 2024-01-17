import java.util.Scanner;

public class FindGreatestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        System.out.println("Enter number of array's size");
        int sizeRow = scanner.nextInt();
        System.out.println("Enter number of element's size");
        int sizeColumn = scanner.nextInt();
        arr =new int[sizeRow][sizeColumn];
        for(int i=0; i< sizeRow;i++){
            for ( int j= 0; j< sizeColumn; j++){
                System.out.println("Enter value of element at arr[" + i + "]" + "[" + j + "]" );
                arr[i][j] = scanner.nextInt();
            }
        }
        int result = find(arr);
        System.out.println("The greatest element in array is: " + result);

    }
    public static int find(int[][]arr){
        int max =arr[0][0];
        for(int i =0; i< arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
