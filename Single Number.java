class Solution {
    public int singleNumber(int[] nums) {
        int entryStorage[] = new int[60001];
        for(int i=0; i < nums.length; i++){
            entryStorage[nums[i] + 30000]++;
        }
        //System.out.println(entryStorage[1]);
        for(int i=0; i<= 60001; i++){
            if(entryStorage[i] == 1){
                return (i-30000);
            }
        }
        return 0;
    }
}
