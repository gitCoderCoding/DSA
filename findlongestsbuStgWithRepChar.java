import java.util.*;
//find longest substing wthout repe char
public class Main {
  
  static void longestOfSubstring(String s)
  {
   String longestSubstring=null;
  int longestSubstringLength=0;
  
  Map<Character,Integer> m=new LinkedHashMap<>();
  char[] a=s.toCharArray();
  int n=a.length;
  for(int i=0;i<n;i++)
  {
        char  c=a[i];
        if(!m.containsKey(c))
        {
          m.put(c,i);
        }
        else
        {
          i=m.get(c);
          m.clear();
        }
        if(m.size()>longestSubstringLength)
        {
                    longestSubstringLength    =  m.size();
                  longestSubstring=  m.keySet().toString();
        }
  }
  System.out.println(longestSubstring);
  System.out.println(longestSubstringLength);
  }
  
  
  
  
  
    public static void main(String[] args) {
  longestOfSubstring("java");
 
  }
}