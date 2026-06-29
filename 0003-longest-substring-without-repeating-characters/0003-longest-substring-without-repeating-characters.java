class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        int maxlen = Math.min(n , 1);
        Set<Character> set = new HashSet<>();

        while(end < n){
            char c = s.charAt(end);

            while(set.contains(c)){
                set.remove(s.charAt(start));
                start +=1;
            }

            set.add(c);

            int w = end - start +1;

            maxlen = Math.max(maxlen,w);
            end+=1;

            
        }
        return maxlen;
    }
}