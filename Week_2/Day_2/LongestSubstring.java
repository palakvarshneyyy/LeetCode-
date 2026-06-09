class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sub = new HashSet<>();
        int l=0;
        int maxL = 0;
        for(int r=0; r<s.length(); r++){
            while(sub.contains(s.charAt(r))){
                sub.remove(s.charAt(l));
                l++;
            }
            sub.add(s.charAt(r));
            maxL = Math.max(maxL, r - l + 1);
        }
        return maxL;
    }
}