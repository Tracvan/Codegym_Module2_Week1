import java.util.Scanner;

public class Print20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        boolean isPrime = true;
        System.out.println("Enter number of Prime want to print");
        number = scanner.nextInt();
          if(number == 1) {
              System.out.println("2");
          }
          if(number>=2){
              for(int i=2;;i++){
                  for(int j=2;j<i;j++){
                      if(i%j == 0){
                          isPrime = false;
                          break;
                      }
                      isPrime = true;
                  }
                  if(isPrime == true){
                      count =count + 1;
                      if(count <=number){
                          System.out.println(i);
                      }else{
                          break;
                      }
                  }
              }
        }
    }
}
