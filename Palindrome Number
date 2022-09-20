class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int currentNumber = x;
        int reverseNumber = 0;
        int reminder = 1;
        while(currentNumber != 0){
         reminder = currentNumber % 10;
         currentNumber = currentNumber / 10;
         reverseNumber = reverseNumber * 10 + reminder;
        }
        if(reverseNumber == x)
         return true;
        else 
         return false;
    }
}
