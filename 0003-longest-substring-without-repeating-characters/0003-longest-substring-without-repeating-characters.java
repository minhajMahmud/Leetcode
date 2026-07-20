class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        HashSet <Character> charSet= new HashSet<>();
        for(int i=0;i<s.length();i++){//here i is to the right window of the problem 
            while(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(i));
            maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}