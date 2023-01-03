import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Q5 {
    public static void main(String[] args) {
        int toSearch;
        int[] nums = new int[20];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 20; i++) {
            nums[i] = rand.nextInt(101);
        }

        printFormattedArray("The generated random numbers are: ", nums);

        for(int i = 0; i < 20; i++) {
            for(int j = i + 1; j < 20; j++) {
                if(nums[i] < nums[j]) {
                    int store = nums[i];
                    nums[i] = nums[j];
                    nums[j] = store;
                }
            }
        }

        printFormattedArray("The sorted numbers are: ", nums);

        System.out.printf("Enter the number to search: ");
        toSearch = sc.nextInt();
        while(numExistsIn(toSearch, nums)) System.out.println("Please enter a number in the above list");
        
        System.out.printf("%d is found\n", toSearch);
        System.out.printf("Linear search - %d loop(s)\n", linearSearch(toSearch, nums));
        System.out.printf("Binary search - %d loop(s)\n", binarySearch(toSearch, nums));
    }

    private static void printFormattedArray(String desc, int[] nums) {
        System.out.println(desc);
        for(int i = 0; i < nums.length; i++) {
            System.out.printf("%d,  ",nums[i]);
        }
        System.out.println();
    }

    private static boolean numExistsIn(int num, int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                return false;
            }
        }
        return true;
    }

    private static int linearSearch(int num, int[] nums) {
        int loops = 0;
        for(int i = 0; i < nums.length; i++) {
            if(num == nums[i]) {
                return loops;
            }
            loops += 1;
        }
        return -1;
    }

    private static int binarySearch(int num, int[] nums) {
        int counter = 1;
        if(nums.length == 1) {
            return 1;
        }
        int idx = (nums.length - 1) / 2;
        if(num > nums[idx]) {
            counter += binarySearch(num, Arrays.copyOfRange(nums, 0, idx));
        } else if(num == nums[idx]) {
            return 1;
        } else {
            counter += binarySearch(num, Arrays.copyOfRange(nums, idx, nums.length));
        }
        return counter;
    }
}
