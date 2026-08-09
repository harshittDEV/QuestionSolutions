class Solution {
    public char repeatedCharacter(String s) {
        char[] str=s.toCharArray();
        char[] check= new char[26];
        for(int i=0;i<str.length;i++){
            
            for(int k=0;k<26;k++){
                if(str[i]==check[k]){
                    return str[i];
                }
                if(check[k]=='\0'){
                    check[k]=str[i];
                    break;

                }
                    
                }
            }
             return ' ';
        }
       

    }
