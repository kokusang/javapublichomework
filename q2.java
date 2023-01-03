import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = new int[10];

        Random rand = new Random();

        int counter = 0;
        outerloop:
        while(counter < 10) {
            int newNum = rand.nextInt(20);
            for(int i = 0; i < nums.length; i++) {
                if(newNum == nums[i]) {
                    continue outerloop;
                }
            }
            System.out.println(newNum);
            nums[counter] = newNum;
            counter += 1;
        }
    }
}
