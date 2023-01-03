import java.util.Random;
import java.util.Scanner;

/* 
 * Write a program to randomly generate N student scores (0-100). The program will
prompt the user to enter N students and store the score in an array. Then, the program
will display a list of score, the highest score, the lowest score and the average score.
 */
public class Q1 {
    public static void main(String[] args) {
        int N;
        int min = 100;
        int max = 0;
        Scanner sc1 = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter a number of students N: ");
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