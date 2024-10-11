public class SubString {
    public static String sub_String(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i <= ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        // Substring
        String str = "HelloDude";
        System.out.println(str.substring(0, 5)); // builtin subString function
        // System.out.println(sub_String(str, 0, 4)); // user defined
    }
}
