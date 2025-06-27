public class Main {
  
  static int[]  twoSum(int[] a,int target)
  {
    for(int i=0;i<=a.length;i++)
    {
      for(int j=i+1;j<=a.length;i++)
      {
        if(a[i]+a[j]==target)
        {
          return new int[]{i,j};
        }
      }
    }
    throw new IllegalStateException("nt fnd");
  }
  
    public static void main(String[] args) {
      
     int[] a = {2,7,11,15};int  target = 9;
     System.out.println(Arrays.toString(twoSum(a,target)));
  }
}