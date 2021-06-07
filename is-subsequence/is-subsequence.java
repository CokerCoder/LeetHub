class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0)
            return true;
        // two-pointer
        int i = 0; int j = 0;
        for (; j<t.length(); j++) {
            if (t.charAt(j) == s.charAt(i)) 
                i++;
            if (i == s.length())
                return true;
        }
        return false;
    }
}