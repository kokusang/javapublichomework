import java.util.Random;
import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {
        int N;
        int min = 100;
        int max = 0;
        Scanner sc1 = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Author              Title                 ");
        N = sc.nextInt();
        System.out.println("Score : ");
        for(int i = 0; i < N; i++) {
            int score = rand.nextInt(101);
            System.out.print(score + "\t|\t");
            if(score < min) min = score;
            if(score > max) max = score;
        }
        System.out.printf("\n\nMaximum score : %d | Minimum score : %d\n", max, min);
    }
}