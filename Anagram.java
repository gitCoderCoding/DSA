//anagram

static boolean areAnagrams(String s1,String s2){

 // eliminate spaces in startog
    String st1=s1.replaceAll("\\s","");
    String st2=s2.replaceAll("\\s","");
    
    //check lengths
    if(st1.length()!=s2.length()){
      return false;
    }
           // Step 3: Frequency array for lowercase a-z (size 26)
         int[] a=new int[26];

   // Count frequency from s1 and subtract using s2
    for(int i=0;i<st1.length();i++)
    {
      a[st1.charAt(i) - 'a']++;
      a[st2.charAt(i) - 'a']--;
    }
     // Step 5: If all counts are zero, it's an anagram
    for(int count  :  a)
    {
    if(count!=0)
    {
      return false;
    }
    }
    return true;
  }
  

