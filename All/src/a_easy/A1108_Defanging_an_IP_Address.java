package ngohoanghung.assignment2.String;

/*
1108. Defanging an IP Address
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

Constraints:
The given address is a valid IPv4 address.
 */
public class A1108_Defanging_an_IP_Address {
    public static void main(String[] args) {
//test("hello.world");

//        defangIPaddr("nguoi tuyet voi nhat");
        System.out.println(defangIPaddr1("255.100.50.0"));
        System.out.println(defangIPaddr1("234.2.50.3"));
        System.out.println(defangIPaddr1("255.22.34.2"));
    }

    //public static void test(String s){
//        String[] str = s.split("\\.");
//    for (String s1 : str) {
//        System.out.println(s1);
//    }
//}
    public static String defangIPaddr(String address) {
        if (!address.matches("^\\d+\\.\\d+\\.\\d+\\.\\d+$"))
            return "input is not valid";
        else {
            String[] newIPAddress = address.split("\\.");
            String str="";
            for (String ipAddress : newIPAddress) {
            }
            for (int i = 0; i < 3; i++) {
                str += newIPAddress[i] + "[.]";
            }
            return str+newIPAddress[3];
        }
    }
    public static String defangIPaddr1(String address){

        return address.replace(".","[.]");
    }
}
