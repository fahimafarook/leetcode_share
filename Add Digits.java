class Solution {
    public int addDigits(int num) {
        return compute(num);
    }
    
    public static int compute(int number){
        int sum = 0;
        int digit;
        while(number !=0){
            digit = number % 10;
            number = number/ 10;
            sum = sum + digit;
        }
        if(sum > 9)
           sum = compute(sum);
        return sum;
    }
}
