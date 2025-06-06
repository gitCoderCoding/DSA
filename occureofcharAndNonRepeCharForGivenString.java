 String s="Hello World";
  
  Map<Character,Integer> m=new LinkedHashMap<>();
  
  //bndry condts
  if(s.isEmpty() || s==null){
    return;
  }
  //finded occ
  for(char  c: s.toCharArray()){
    if(c ==' ') continue;
    m.put(c,m.getOrDefault(c,0)+1);
  }
  
//print  
  for(Map.Entry entry        :m.entrySet()){
    System.out.println(entry.getKey() +"->"+ entry.getValue());
  }
  
  //1st non char
  
  for(Map.Entry<Character,Integer> entry        :m.entrySet()){
    if(entry.getValue() == 1){
      System.out.println("1st npn char "  +  entry.getKey());
      return;
    }
  }
  
  
  }
}