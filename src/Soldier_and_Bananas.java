import java.util.Scanner;

public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        int initial_amount = scanner.nextInt();
        int count = scanner.nextInt();
        int total_cost = ((count*(count+1))/2) * cost;
        if(total_cost > initial_amount){
            System.out.println(total_cost- initial_amount);
        } else {
            System.out.println(0);
        }

    }
}
