class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        int num_2 = 0;
        int[] resList= new int[2] ;
        aa: for (int i = 0; i < nums.length; i++){
            temp = target - nums[i];
            int tIn = i;
            for (int m = (i+1); m < nums.length; m++){
                num_2 = nums[m];
                if (num_2 == temp){
                    resList[0] = tIn ;
                    resList[1] = m;
                    break aa;
                }
            }
        }
        return resList;
    }
}