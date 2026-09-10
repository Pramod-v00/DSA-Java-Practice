class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        char[] ch=s.toCharArray();
        int cnt=0,l=0,r=removable.length;
        while(l<r){
            int mid=(l+r+1)/2;
            char[] copy= ch.clone();
            mark(copy,removable,mid);
            if(!check(copy,p)) r=mid-1;
            else l=mid;
        }
        return l;
    }
    boolean check(char[] s,String p){
        int i = 0; 
        int j = 0; 
        while(i < s.length && j < p.length()) {
            if(s[i] == p.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == p.length();
    }
    void mark(char[] ch,int[] m,int mid){
        for(int i=0;i<mid;i++){
            ch[m[i]]='#';
        }
    }
}