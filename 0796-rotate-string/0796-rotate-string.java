class Solution {
    public boolean rotateString(String s, String goal) {
        String conca = s + s;
        if(s.length() != goal.length()){
            return false;
        }

        if(conca.contains(goal)){
            return true;
        }

        return false;
    }
}