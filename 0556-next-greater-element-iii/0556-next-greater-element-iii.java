class Solution {
    public int nextGreaterElement(int n) {
        int org=n,i=0;
        char[] a=(String.valueOf(n)).toCharArray();
        int j=a.length-2;
        boolean flag=true;
        while(j>=0){
            i=a.length-1;
            if(a[j]<a[j+1]){
                while(i>=j){
                    if(a[i]>a[j]){
                        swap(a,i,j);
                        break;
                    }
                    i--;
                }
                rev(a, j+1,a.length-1);
                flag=false;
            }
            j--;
            if(!flag){
                long ans = Long.parseLong(new String(a));
                if(ans>Integer.MAX_VALUE) return -1;
                return (int)ans;
            } 
        }
        return -1;
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