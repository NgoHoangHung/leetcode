package a_easy;

public class A1295_Find_Numbers_With_Even_Number_of_Digits {
    public static void main(String[] args) {

    }

    public static int findNumbers(int[] nums){
        int resul =0;
        for(int i = 0 ; i<nums.length; i++){
            int count = 0;
            int element = nums[i];
            while(element>=1){
                element/=10;
                count++;
            }
            if(count%2==0)
                resul++;
        }
        return resul;
    }
}
