import java.util.Scanner;

public class Lucky_division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int check = number;
        while (check > 0){
            int rem = check %10;
            if(rem == 4 || rem == 7){
                check = check/10;
            } else {
                break;
            }
        }
        if(check == 0) {
            System.out.println("YES");
        }
        else if(number % 4 ==0 || number % 7 == 0 || number % 47 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
