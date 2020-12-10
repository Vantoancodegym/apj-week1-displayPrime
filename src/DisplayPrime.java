import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of prime");
        int n = input.nextInt();
        int count = 0;
        int number = 2;
        while (count<n){
            if (checkPrime(number)){
                count++;
                System.out.println(number);
            }
            number++;
        }
    }
    public static boolean checkPrime(int number){
        if (number<=1){
            return false;
        }else if(number==2){
            return true;
        }else if (number>2){
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
