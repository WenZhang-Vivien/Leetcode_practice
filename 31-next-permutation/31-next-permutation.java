class Solution {
    public void nextPermutation(int[] nums) {
        boolean into = false;
        int[] tempNums = nums.clone();
        Arrays.sort(tempNums);
        int maxNum = tempNums[tempNums.length-1];
        
        int preNum = nums[nums.length-1];
        aa: for (int i = nums.length-2; i >= 0; i--){
            if (nums[i]<preNum){
                for (int n = i+1; n <= nums.length-1; n++){
                    int tempNumN = nums[n];
                    if(n == nums.length-1){
                        into = true;
                        nums[n] = nums[i];
                        nums[i] = tempNumN;
                        reverse(nums,i);
                        break aa;
                    }else if (nums[n]>nums[i] && nums[n+1]<=nums[i]){
                        into = true;
                        nums[n] = nums[i];
                        nums[i] = tempNumN;
                        reverse(nums,i);
                        break aa;
                    }
                }
                
            }
            preNum = nums[i];
        }
        if (into == false){
            reverse(nums, -1);
        }
        
        
    }
    // public void reverse(int[] nums, int i){
    //     for (int n = i+1; n < nums.length; n++){
    //         if(nums[n]>nums[n+1]){
    //             int tempNumN = nums[n];
    //             nums[n] = nums[n+1];
    //             nums[n] = tempNumN;
    //         }
    //     }
    // }
    private void reverse(int[] nums, int start) {
        int i = start+1, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
}