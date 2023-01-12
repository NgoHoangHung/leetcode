package b_medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class B1282_Group_the_People_Given_the_Group_Size_They_Belong_To {
    @Test
    public void unitTest() {
        //data
        int[] groupSizes = { 3, 3, 3, 3, 3, 1, 3 };
        List<Integer> tmp1 = new ArrayList<>();
        tmp1.add(5);
        List<Integer> tmp2 = new ArrayList<>();
        tmp2.add(0);
        tmp2.add(1);
        tmp2.add(2);
        List<Integer> tmp3 = new ArrayList<>();
        tmp3.add(3);
        tmp3.add(4);
        tmp3.add(6);
        List<List<Integer>> resul = new ArrayList<>();
        resul.add(tmp1);
        resul.add(tmp2);
        resul.add(tmp3);
        groupThePeople(groupSizes);
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        if (n == 1) {
            List<List<Integer>> listAll = new ArrayList<>();
            List<Integer> tmp = new ArrayList<>();
            tmp.add(groupSizes[0]);
            listAll.add(tmp);
            return listAll;
        } else {
            int max = groupSizes[0];
            for (int i = 1; i < n; i++) {
                if (groupSizes[i] > max)
                    max = groupSizes[i];
            }
            List<List<Integer>> listAll = new ArrayList<>();
            for (int i = 1; i <= max; i++) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int j = 0; j < n; j++) {

                    if (groupSizes[j] == i) {
                        tmp.add(j);
                        if (tmp.size() == i) {
                            ArrayList<Integer> cloneArr = new ArrayList<>();
                            cloneArr = (ArrayList<Integer>) tmp.clone();
                            listAll.add(cloneArr);
                            tmp.clear();
                        }


                    }
                }
            }
            return listAll;
        }
    }

    public List<List<Integer>> groupThePeople2ms(int[] groupSizes){
        int n = groupSizes.length;
        List<Integer>[] map = new ArrayList[n+1];
        for (int i = 0; i < n; i++) {
            List<Integer> integers = map[i];

        }
        return null;
    }
}
/**
 * 1282. Group the People Given the Group Size They Belong To
 * There are n people that are split into some unknown number of groups.
 * Each person is labeled with a unique ID from 0 to n - 1.
 * You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in.
 * For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.
 * Return a list of groups such that each person i is in a group of size groupSizes[i].
 * Each person should appear in exactly one group, and every person must be in a group.
 * If there are multiple answers, return any of them.
 * It is guaranteed that there will be at least one valid solution for the given input.
 * <p>
 * Example 1:
 * Input: groupSizes = [3,3,3,3,3,1,3]
 * Output: [[5],[0,1,2],[3,4,6]]
 * Explanation:
 * The first group is [5]. The size is 1, and groupSizes[5] = 1.
 * The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
 * The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
 * Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
 * <p>
 * Example 2:
 * Input: groupSizes = [2,1,3,3,3,2]
 * Output: [[1],[0,5],[2,3,4]]
 * <p>
 * Constraints:
 * groupSizes.length == n
 * 1 <= n <= 500
 * 1 <= groupSizes[i] <= n
 */