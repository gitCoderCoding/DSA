 User function Template for Java

class Solution {
    void rearrange(ArrayListInteger a) {
      two list pos and neg
      ListInteger listPos =new ArrayList();
      ListInteger listNeg =new ArrayList();
      for(int i=0;ia.size();i++)
      {
      if(a.get(i)=0)
      {
        listPos.add(a.get(i));
      }
      else
      {
      listNeg.add(a.get(i));    
       }
      }
      rearrangement
      int pos=0,neg=0,index=0;
      while(poslistPos.size() && neglistNeg.size())
      {
        a.set(index++,listPos.get(pos++));
        a.set(index++,listNeg.get(neg++));
      }
      while(poslistPos.size())
      {
         a.set(index++,listPos.get(pos++));
      }
      while(neglistNeg.size()){
          a.set(index++,listNeg.get(neg++));
      }
    }
}