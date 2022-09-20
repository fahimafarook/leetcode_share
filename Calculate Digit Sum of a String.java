class Solution {
    static int kSize;
    public String digitSum(String s, int k) {
        if(s.length() <= k)
            return s;
        kSize = k;
        return compute(s);
    }
    
    public static String compute(String s){
        int sum = 0;
        String computedString = "";
        int i=0;
        while(i< s.length()){
            for(int j=1; j<=kSize ;j++){
                if (i> s.length()-1) break;
                sum += s.charAt(i++)-48;
            }
            computedString += sum;
            sum = 0;
        }
        if (computedString.length() > kSize)
           computedString = compute(computedString);
        return computedString;
    }
}
