class Solution {
    public int getSecondLargest(int[] a) {
        // assume
        int max=Integer.MIN_VALUE;
        int secondMax=-1;
        
        for(int num : a)
        {
            if(num>max)
            {
                  secondMax=max; 
                  max=num;
            }
            else if(num<max && num>secondMax)
            {
                         secondMax=num;
            }
        }
        return (secondMax==Integer.MIN_VALUE) ? -1 :secondMax;
    }
}