package a_easy;

public class A387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int[] tmp = new int[123];
        for (char c : s.toCharArray()) {
            tmp[c]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (tmp[s.charAt(i)] == 1) return i;

        }
        return -1;
    }

    public int firstUniqChar0ms(String s) {
        int res = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)) res = Math.min(res, index);
        }
        return res == Integer.MAX_VALUE ? -1 : res;

    }
}
