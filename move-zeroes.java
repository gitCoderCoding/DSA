class Solution {
    public void moveZeroes(int[] a) {
        //2 pointers
//bdry checks
int n=a.length;
if(n==1 || n==0 ){
    return;
}

        int nz=0,z=0;
        //traverse
        while(nz<n)
        {
        if(a[nz]!=0)
        {
            //swap
            int temp=a[nz];
                 a[nz]=a[z];
                 a[z]=temp;
                 nz++;
                 z++;
        }
        else
        {
          nz++;
        }
    }
}
}