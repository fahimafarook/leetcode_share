class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = true;
        int i;
        for(i = digits.length-1; i>=0 && carry; i--){
           if (digits[i] == 9){
               digits[i] = 0;
               carry = true;
           }
            else{
                digits[i] = digits[i]+1;
                carry = false;
            } 
        }
        if(carry == true && digits[0] == 0){
            int newarr[] = new int[digits.length+1];
            newarr[0] = 1;
            for(i=1; i< digits.length; i++){
                newarr[i] = digits[i];
            }
             return newarr;  
        }
        return digits;     
    }
}
