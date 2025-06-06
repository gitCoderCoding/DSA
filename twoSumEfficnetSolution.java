class Solution {
    public int[] twoSum(int[] a, int target) {
        //ef
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
        int ans=target-a[i];
        if(m.containsKey(ans))
        {
        return new int[]{m.get(ans),i};
        }
        m.put(a[i],i);
    }
    throw new  IllegalArgumentException("no pr fnd");
}
}