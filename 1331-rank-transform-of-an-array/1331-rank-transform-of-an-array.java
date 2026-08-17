class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] rank=new int[arr.length];
        int count=1;
        Map<Integer,Integer> map=new HashMap<>();
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        for(int i:sorted){
            if(!map.containsKey(i)){
                map.put(i,count++);
            }
        }
        for(int i=0;i<arr.length;i++){
            rank[i]=map.get(arr[i]);
        }
        return rank;
    }
}