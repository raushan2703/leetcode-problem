//problem : 169-majority element 
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
/*You sort the array.

Get the element at middle index n/2.

Return it — it will always be the majority as per the problem guarantee.*/
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}

/* here is the more efficent way

Maintain a candidate and a count

Go through the array:

If count is 0 → choose current number as candidate

If number equals candidate → count++

Else → count--*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}


