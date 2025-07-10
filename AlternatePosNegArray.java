public class codefile{
    static int[] sort(int[]  a){
     int[] postive=new int[a.length];
     int[] negative=new int[a.length];
     int posIndex = 0, negIndex = 0;
for(int i=0;i<a.length;i++)
{
     if(a[i]>=0)
     {
           postive[posIndex++]  = a[i];
     }
     else{
           negative[negIndex++]  = a[i];
     }
}
//rearrangement
int pos=0,neg=0,index=0;
while(pos<posIndex && neg<negIndex)
{
     a[index++] =postive[pos++];
     a[index++]= negative[neg++];
}

while(pos<posIndex)
a[index++] =postive[pos++];

while(neg<negIndex)
a[index++]= negative[neg++];

return a;

    }
}