import java.util.Scanner;

public class FindStudenPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students");
        int size = scanner.nextInt();
        int[] markList = new int[size];
        for(int i = 0; i<size; i++){
            System.out.println("Enter marks of student " + (i +1));
            markList[i] = scanner.nextInt();
            if(markList[i]<0 || markList[i] >10) {
                System.out.println("Mark is not right");
                System.exit(0);
            }

        }
        int result = count(markList);
        System.out.println("Number of passed student: " + result);
    }
    public static int count(int[] arr){
        int count = 0;
        for ( int i = 0; i< arr.length; i++){
            if(arr[i]>= 5){
                count += 1;
            }
        }
        return count;
    }
}
