class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> CharSet = new HashSet<>();

        int left = 0;
        int result = 0;

        for(int r = 0; r < s.length() ; r++){
            while(CharSet.contains(s.charAt(r))){
                CharSet.remove(s.charAt(left));
                left++;
            }
            CharSet.add(s.charAt(r));
            result = Math.max(result , r-left +1);
        }

        return result;
    }
}