class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        char[] note = magazine.toCharArray();
        for(int i=0; i<note.length; i++){
            count[note[i] - 'a']++;
        }
        char[] rans = ransomNote.toCharArray();
        for(int i=0; i<rans.length; i++){
            count[rans[i] - 'a']--;
             
            if(count[rans[i] - 'a'] < 0){
                return false;
            } 
        }
        return true;
    }
}