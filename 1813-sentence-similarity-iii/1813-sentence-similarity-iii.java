class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        if(sentence1.length()<sentence2.length()) return com(sentence1,sentence2);
        return com(sentence2,sentence1);

    }
    boolean com(String s1,String s2){
        int cnt=0;
        String[] ans=s1.split(" ");
        String[] ans1=s2.split(" ");
         int st=0,end=0;
         while(st<ans.length && ans[st].equals(ans1[st])){
            st++;
            cnt++;
         }
         while(end<ans.length-st && ans[ans.length-end-1].equals(ans1[ans1.length-end-1])){
            end++;
            cnt++;
         }
         System.out.print(cnt);
        return cnt==ans.length;
    }
}