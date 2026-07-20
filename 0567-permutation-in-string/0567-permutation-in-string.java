class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n2<n1) return false;
        int [] cnt1=new int[26];
        int [] cnt2 =new int[26];
        for(int i=0;i<n1;i++){
            cnt1[s1.charAt(i)-'a']++;
            cnt2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(cnt1,cnt2)) return true;
        for(int i=n1;i<n2;i++){//sliding window er kaj kortece 2 ghor kore jeta s1 er size then 
            cnt2[s2.charAt(i)-'a']++; // add korbe jemon ei chilo add korbe eid 
            cnt2[s2.charAt(i-n1)-'a']--;//bad dibe ei theke e then hobe hobe id 
           if(Arrays.equals(cnt1,cnt2)) return true;
        }
        return false;
    }
}