import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode3 {
    public static  int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int max = 0;
        int left = 0;
        Map map = new HashMap();
        while(left<s.length()){
            if(map.containsKey(s.charAt(left))){
                if(map.size()>max){
                    max = map.size();
                }
                left=(int)map.get(s.charAt(left))+1;
                map.clear();
                continue;
            }
            map.put(s.charAt(left),left);
            left++;
        }
        if(max==0){
            max = map.size();
        }
        if(map.size()>max){
            return map.size();
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
