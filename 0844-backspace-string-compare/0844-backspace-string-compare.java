class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        
        while (i >= 0 || j >= 0) {
            i = nextValidChar(s, i);
            j = nextValidChar(t, j);
            
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) return false;
            } else if (i >= 0 || j >= 0) {
                return false; // one ran out, other didn't
            }
            i--;
            j--;
        }
        return true;
    }
    
    private int nextValidChar(String str, int index) {
        int skip = 0;
        while (index >= 0) {
            if (str.charAt(index) == '#') {
                skip++;
                index--;
            } else if (skip > 0) {
                skip--;
                index--;
            } else {
                break; // found a valid, non-deleted character
            }
        }
        return index;
    }
}