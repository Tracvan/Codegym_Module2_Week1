import java.util.Scanner;

public class DeleteElementInArray {
    static int[] arr = {1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number want to delete");
        int number;
        number = scanner.nextInt();
        int[] result = delete(number);
        System.out.println("Deleted array is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }

    }
    public static int[] delete(int number){
        for ( int i = 0; i< arr.length-1; i++){
            if(arr[arr.length-1]==number){
                arr[arr.length-1]=0;
            }
            if(arr[i] == number){
                for(int j= i; j<arr.length-1;j++)
                arr[j] = arr[j+1];
                arr[arr.length-1] = 0;
            }
        }
        return arr;
    }
}
