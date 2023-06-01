package Algorithm;

public class LongPalindrome {
    public int  longPalinDrome(String s) {
        int[] count = new int[128];
        int length=s.length();
        for(int i=0;i<length;i++){
            char c=s.charAt(i);
            count[c]++;
        }
return 0;
    }
}
