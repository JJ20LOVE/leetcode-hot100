import java.util.HashMap;

public class hot7 {
    public static void main(String[] args) {

    }
    class Solution {
        public int lengthOfLongestSubstring(String s) {

            HashMap<Character, Integer> record = new HashMap<>();
            int ans = 0;
            int left = 0;
            int right = 0;
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(!record.containsKey(c)) {
                    record.put(c,i);
                    right = Math.max(right,i);
                    ans=Math.max(ans,right-left+1);
                }
                else {
                    left=Math.max(left,record.get(c)+1);
                    record.put(c,i);
                    right=Math.max(right,i);
                    ans=Math.max(ans,right-left+1);
                }
            }
            return ans;
        }

    }
}
