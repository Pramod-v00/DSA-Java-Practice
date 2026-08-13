class Solution {
    public int missingInteger(int[] nums) {
        // int[] ch=new int[51];
        Set<Integer> st=new HashSet<>();
        int cnt=0,sum=nums[0];
        for(int num:nums){
            st.add(num);
            // if(ch[num]==1) continue;
            // ch[num]++;
        }
        int i=1;
        while(i<nums.length && nums[i]==nums[i-1]+1){
            sum+=nums[i];
            i++;
        }
        while(st.contains(sum)) sum++;

        return sum;
    }
}