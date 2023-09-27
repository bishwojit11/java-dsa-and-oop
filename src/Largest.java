import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 =  input.nextInt();
        int num3 = input.nextInt();

        int max_num = num1;
        if(num2 > max_num){
            max_num = num2;
        } else if  (num3 > max_num) {
            max_num = num3;

        }
    }
}
