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
  
  void replaceSpaces(char(J str, int trueLength) {
    int spacecount,index,i;
    for(i=0; i<str.size(); i++){
      if(str[i] == ' ')
        spacecount+=1;
    }
    index=trueLength+spacecount*3;
    if(trueLength<str.size()) str[trueLength] = '\0';
    for(i=trueLength-1;i>=0; i--){
      if(str[i] == ' '){
        str[index-1]='0';
        str[index-2]='2';
        str[index-3]='%';
        index=index-3;
      }
      else{
        str[index-1]=str[i];
        index--;
      }
    }
  }
                     

4.
    
   
