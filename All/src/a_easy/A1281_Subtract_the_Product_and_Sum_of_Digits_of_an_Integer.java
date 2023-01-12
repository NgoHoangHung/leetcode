package a_easy;

import org.junit.jupiter.api.Test;

public class A1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    @Test
    public void unitTest(){
        //data

    }
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 1) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return product - sum;
    }
}
