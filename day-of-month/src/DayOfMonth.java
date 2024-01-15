import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[]args){
        System.out.println("Enter month which you want to count day ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String dayInMonth;
        switch (month){
            case 2:
                dayInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30";
                break;
            default:
                dayInMonth = "";
                break;
        }
        if(!dayInMonth.equals("")) System.out.printf("the month '%d' has %s days", month, dayInMonth);
        else System.out.print("Invalid input!");
    }
}
