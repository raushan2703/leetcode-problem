/*Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
  */
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i<nums.length; i++){
            if ( j== 1 || nums[i] != nums[j-2]){
                nums[j++] = nums[i];

            }
        }
        return j;
        
    }
}
