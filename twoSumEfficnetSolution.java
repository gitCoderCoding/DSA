public class Main {
  
  static int[]  twoSum(int[] a,int target)
  {
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
    
    throw new IllegalArgumentException("nt fnd");
    
    
  }
  
    public static void main(String[] args) {
      
     int[] a = {2,7,11,15};int  target = 9;
     System.out.println(Arrays.toString(twoSum(a,target)));
  }
}