import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String you like: ");
        String str = scanner.nextLine();
        System.out.println("Input a character want to count: ");
        char a = scanner.next().charAt(0);
        int result = count(str,a);
        System.out.println("Has " + result + " character " + a + " in string.");
    }
    public static int count(String str, char a){
        int count = 0;
        for (int i=0; i<str.length(); i++ ){
            if(str.charAt(i) == a){
                count += 1;
            }
        }
        return count;
    }
}
