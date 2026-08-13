class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int[] ch=new int[101];
        int max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            ch[nums[i]]++;
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        while(min<max){
            if(ch[min]==0) list.add(min);
            min++;
        }
        return list;
    }
}