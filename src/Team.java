import java.util.Scanner;

public class Team {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int problems = scanner.nextInt();
        int[][] question = new int[problems][3];
        for(int i =0; i<problems;i++){
            int num1 = scanner.nextInt();
            question[i][0] = num1;
            int num2 = scanner.nextInt();
            question[i][1] = num2;
            int num3 = scanner.nextInt();
            question[i][2] = num3;
        }
        int result = 0;
        for(int i = 0;i<problems;i++){
            int count =0;
            for(int j=0;j<3;j++){
                if(question[i][j] == 1){
                    count++;
                }
            }
            if(count >=2){
                result++;
            }
        }
        System.out.println(result);
    }
}
