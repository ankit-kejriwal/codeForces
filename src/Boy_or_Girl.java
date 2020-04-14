import java.util.HashSet;
import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<name.length();i++){
            set.add(name.charAt(i));
        }
        int size = set.size();
        if(size %2 !=0){
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
