import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        if(number == 2 ){
            isPrime = true;
        }else if (number > 2){
            for ( int i = 2; i<number/2 ;i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        else{
            isPrime = false;
        }if(isPrime == true){
            System.out.print(number +" is prime");
        }else{
            System.out.print(number + " is NOT prime");
        }

    }
}
