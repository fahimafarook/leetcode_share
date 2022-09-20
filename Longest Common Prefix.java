class Solution {
    public String longestCommonPrefix(String[] strs) {
        int smallLenght = strs[0].length();
        String smallString = strs[0];
        for(int i = 0; i < strs.length; i++){
            if (strs[i].length() < smallLenght){
               smallLenght =  strs[i].length();
               smallString = strs[i];
            }
        }
        int breakIndex = smallString.length()-1;
        boolean dontBreak = true;
        for(int i = 0; i < smallString.length() && dontBreak; i++){
            for(int j = 0; j < strs.length; j++){
                if(smallString.charAt(i) != (strs[j].charAt(i))){
                    breakIndex = i-1;
                    dontBreak = false;
                    break;
                }
            }      
        }
        return smallString.substring(0,breakIndex+1);
    }
}
