import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of Pascal Triangle to generate: ");
        n = sc.nextInt();
        System.out.printf("The Pascal Triangle with %d row(s)\n", n);

        int[] row = new int[n];

        for(int i = 0; i < n; i++) {
            row[i] = 0;
        }
        row[0] = 1;
        printArray(row);

        for(int i = 0; i < n-1; i++) {
            int[] newRow = new int[n];
            newRow[0] = 1;
            for(int j = 1; j < n ; j++) {
                newRow[j] = row[j] + row[j-1];
            }
            row = newRow;
            printArray(row);
        }
    }

    private static void printArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("%d\t", nums[i]);
        }
        System.out.println();
    }
}
