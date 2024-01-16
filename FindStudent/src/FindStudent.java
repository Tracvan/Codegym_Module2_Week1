import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter Student's name");
        String name = scanner.nextLine();
        boolean isfound = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + i);
                isfound = true;
                break;
            }

        }
        if (!isfound) {
            System.out.println("NOT found " + name + " in students list");
        }
    }
}

