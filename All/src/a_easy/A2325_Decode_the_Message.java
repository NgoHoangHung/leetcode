package a_easy;


/*
2325. Decode the Message
You are given the strings key and message, which represent a cipher key and a secret message, respectively.
The steps to decode message are as follows:
Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet),
we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.

Example 1:
Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
Example 2:
Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
Output: "the five boxing wizards jump quickly"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".

Constraints:
26 <= key.length <= 2000
key consists of lowercase English letters and ' '.
key contains every letter in the English alphabet ('a' to 'z') at least once.
1 <= message.length <= 2000
message consists of lowercase English letters and ' '.
 */
public class A2325_Decode_the_Message {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }

    public static String cipherKey(String key) {
        char[] cipheredKey = new char[26];//khai báo mảng key mã hóa thu được
        char[] keyOrigin = key.toCharArray();// chuyển chuỗi key về mảng

        boolean[] usedLetter = new boolean[123]; // cờ check tính duy nhất
        int indexAnphabetTable = 0; //con trỏ của bảng chữ cái
        int indexKeyTable = 0; // con trỏ của đoạn key chưa mã hóa
        // tạo bảng mã hóa
        while (indexAnphabetTable < 26 && indexKeyTable < keyOrigin.length) {
            char charReference = keyOrigin[indexKeyTable];
            if (!usedLetter[(int) charReference] && (int) charReference != 32) {
                cipheredKey[indexAnphabetTable] = charReference;
                indexAnphabetTable++;
                usedLetter[(int) charReference] = true;
            }
            indexKeyTable++;
        }
        return String.valueOf(cipheredKey);
    }

    public static String decodeMessage(String key, String message) {
        char[] cipherKeyArrray = cipherKey(key).toCharArray();
        String resul = "";
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < cipherKeyArrray.length; j++) {
                if (message.charAt(i) == cipherKeyArrray[j]){
                    resul += (char)(j + 97);
                }

            }
            if(message.charAt(i) == 32)
                resul+=" ";
        }
        return resul;
    }
}
