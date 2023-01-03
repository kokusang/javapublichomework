import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int N;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the number of employee N: ");
        N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int total = 0;
            System.out.println("=".repeat(40));
            System.out.printf("Working hour of employee #%d: \n", i + 1);
            for(int j = 0; j < 7; j++) {
                int workHour = 1 + rand.nextInt(8);
                total += workHour;
                System.out.printf("%s : %d\t", days[j], workHour);
            }
            System.out.printf("\nTotal: %d\n", total);
        }
    }
}
