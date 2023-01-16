public class test1 {
    public static void main(String[] args) {
        int size = 10;
        double [] FuckingList = new double[size];
         FuckingList [0] = 12.2;
         FuckingList [1] = 13.3;
         FuckingList [2] = 14.4;
         FuckingList [4] = 15.5;
         FuckingList [5] = 16.6;
         FuckingList [6] = 17.7;
         FuckingList [7] = 18.8;
         FuckingList [8] = 19.9;
         double total = 0;
         for (int i = 0; i < size; i ++){
            total += FuckingList[i];
         }    
        System.out.println(total);
    }
    
}