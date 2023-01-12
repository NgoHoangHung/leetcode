package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class A2367_Number_of_Arithmetic_Triplets {
    @Test
    public void unitTest(){
        int[] arr = {0,1,4,6,7,10};
        Assertions.assertEquals(2,arithmeticTriplets(arr,3));
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(nums[i]);
            set.add(nums[i] + diff);
            set.add(nums[i] + diff + diff);
            for (int j = i ; j < nums.length; j++) {
                if (set.contains(nums[j])) set.remove(nums[j]);
            }
            if (set.size() == 0) count++;
        }
        return count;
    }
    public int arithmeticTriplets3ms(int[] nums, int diff) {

        int ans = 0;

        Set<Integer> seen  = new HashSet<>();

        for( int num :nums){
            if(seen.contains(num - diff) && seen.contains(num - diff *2)){
                ++ans;
            }
            seen.add(num);

        }
        return ans;
    }
}
