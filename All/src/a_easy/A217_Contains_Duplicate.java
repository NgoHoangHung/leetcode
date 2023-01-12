package a_easy;

import java.util.HashSet;
import java.util.Set;

public class A217_Contains_Duplicate {
    public static void main(String[] args) {
int[] nums = {1,2,3,1};
int[] nums1 = {1,2,3,4};
int[] nums2 = {1,1,1,3,3,4,3,2,4,2};
A217_Contains_Duplicate Obj = new A217_Contains_Duplicate();
        System.out.println(Obj.containsDuplicate(nums));
        System.out.println(Obj.containsDuplicate(nums1));
        System.out.println(Obj.containsDuplicate(nums2));
    }

    public boolean containsDuplicate(int[] nums) {
if(nums.length == 1) return false;
        Set<Integer> hashSetObj  = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSetObj.add(nums[i])) return true;
        }
        return false;
    }
}
