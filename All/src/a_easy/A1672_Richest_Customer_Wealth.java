package a_easy;

public class A1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            int countTmp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                countTmp += accounts[i][j];
            }
            if (count < countTmp){
                count = countTmp;
                System.out.println("count = " + count + " tại i = " +i);
            }
        }

        return count;
    }
}
