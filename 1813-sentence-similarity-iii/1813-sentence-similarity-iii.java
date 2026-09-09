class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        
        if(sentence1.length()<sentence2.length()) return com(sentence1,sentence2);
        return com(sentence2,sentence1);

    }
    boolean com(String s1,String s2){
        int cnt=0;
        String[] ans=s1.split(" ");
        String[] ans1=s2.split(" ");
         int st=0,end=ans.length-1;
         int i=0,j=ans1.length-1;
         if(ans.length==1 && ans[0].equals(ans1[0]) || ans[0].equals(j)) return true;
         while(st<ans.length && ans[st].equals(ans1[i])){
            st++;
            i++;
            cnt++;
         }
         while(end>=st && ans[end].equals(ans1[j])){
            end--;
            j--;
            cnt++;
         }
         System.out.print(cnt);
        return cnt==ans.length;
    }
}