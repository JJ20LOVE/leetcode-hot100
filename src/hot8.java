import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class hot8 {
    public static void main(String[] args) {

    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length(), m = p.length();
        if (n < m) return res;

        int[] need = new int[26], window = new int[26];
        for (char c : p.toCharArray()) need[c - 'a']++;

        for (int i = 0; i < n; i++) {
            window[s.charAt(i) - 'a']++;          // 右端进入窗口
            if (i >= m) window[s.charAt(i - m) - 'a']--;  // 左端移出窗口
            if (i >= m - 1 && Arrays.equals(window, need)) res.add(i - m + 1);
        }
        return res;
    }
}
