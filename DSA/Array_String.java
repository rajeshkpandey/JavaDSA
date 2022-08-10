1.
  boolean isUniqueChars(String str) { 
  if (str.length() > 128) return false; 
  boolean [] hash_at = new boolean[128];
  for(int i=0; i<str.size(); i++){
    int x=str.charAt(i);
    if(hash_at[x])  // Here the item is repeated
      return false;
    hash_at[x]=true;    
  }
  return true;
}


2.
  
  boolean permutation(String s, String t) { 
  if(s.size()!=t.size()) return false;
  char [] c1 = s.toCharArray();
  char [] c2 = t.toCharArray();
  Arrays.sort(c1);
  Arrays.sort(c2);
  return c1.equals(c2);
}

3.
  
  
