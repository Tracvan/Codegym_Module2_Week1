import java.util.Arrays;
import java.util.Scanner;

public class AddElementAtEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int number;
        System.out.println("Enter number need to add: ");
        number = scanner.nextInt();
        int[] result = add(arr,number);
        System.out.println(Arrays.toString(result));

    }
    public static int[] add(int[] arr,int number){
        int[] newArr;
        newArr = new int[arr.length+1];
        for(int i=0; i< newArr.length-1; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = number;
        return newArr;
    }
}
