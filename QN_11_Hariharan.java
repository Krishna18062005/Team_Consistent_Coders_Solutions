public class main {
    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        
        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            
            l++;
            r--;
        }
        return new String(chars);
    }
