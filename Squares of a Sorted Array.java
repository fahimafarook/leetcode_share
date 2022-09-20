class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums.length == 1){
            nums[0] = nums[0] * nums[0];
            return nums;
        }
        int positiveCentre = 0; // pointer 1
        int negativeCentre = 0; // pointer 2
        for(int i=0 ; i< nums.length-1; i++){
            if(nums[i] < 0  && nums[i+1] >= 0){
                negativeCentre = i;
                positiveCentre = i+1;
            } 
        }
        if(nums[nums.length-1] < 0){
            negativeCentre = nums.length-1;
            positiveCentre = nums.length;
        }
         if(nums[0] >= 0){
           positiveCentre = 0;
           negativeCentre = -1;
             
         }
        int outputArr[] = new int[nums.length];
        int i = 0;
        //System.out.println(positiveCentre + " ---- "+ negativeCentre); to debug
        while(negativeCentre >= 0 || positiveCentre <= nums.length-1){
          if(positiveCentre >= nums.length || (negativeCentre >-1 && nums[negativeCentre]*-1 < nums[positiveCentre])){
             outputArr[i++] =  nums[negativeCentre] * nums[negativeCentre];
             negativeCentre--;
          }    
          else{
              outputArr[i++] =  nums[positiveCentre] * nums[positiveCentre];
              positiveCentre++;
         }
            
        }
        return outputArr;
    }
}




















