import java.util.Scanner;

import javax.xml.transform.Source;

public class Q4 {
    public static void main(String[] args) {
        int[][] arrays = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3 by 3 array");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }

        System.out.println("The rotated array is : ");
        for(int i = 0; i < 3; i++) {
            for(int j = 2; j >= 0; j--) {
                System.out.printf("%d ", arrays[j][i]);
            }
            System.out.println();
        }

    }
}
