package a_easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class A1431_Kids_With_the_Greatest_Number_of_Candies {
    @Test
    public void unitTest() {
        //data
        int[] candies1 = { 2, 3, 5, 1, 3 };
//       List<Boolean>[] resul1 = new ArrayList<>{true,true,true,false,true};

//        Assertions.assertEquals(kidsWithCandies(candies1, 3));
//        int[] candies2 = { 4, 2, 1, 1, 2 };
//        Assertions.assertEquals(candies2, 1);
//        int[] candies3 = { 12, 1, 12 };
//        Assertions.assertEquals(candies3, 10);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) maxCandies = candy;
        }
        List<Boolean> resul = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) resul.add(true);
            else resul.add(false);
        }
        return resul;
    }
}
