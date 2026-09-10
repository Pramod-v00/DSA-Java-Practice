class Solution {
    public int nextGreaterElement(int n) {
        int org=n,i=0;
        char[] a=(String.valueOf(n)).toCharArray();
        int j=a.length-2;
        boolean flag=true;
        while(j>=0 && a[j]>=a[j+1]){
            j--;
        }
        if(j==-1) return -1;

        i=a.length-1;
            
        while(i>j && a[i]<=a[j]){
            i--;
        }
        swap(a,i,j);
        rev(a, j+1,a.length-1);       
        long ans = Long.parseLong(new String(a));
        if(ans>Integer.MAX_VALUE) return -1;
        return (int)ans;
    }
    void swap(char[] a,int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    void rev(char[] a,int l,int r){
        while(l<r){
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        
    }
}