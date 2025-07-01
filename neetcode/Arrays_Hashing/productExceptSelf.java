/*Products of Array Except Self
Solved 
Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

Each product is guaranteed to fit in a 32-bit integer.

Follow-up: Could you solve it in O(n)
O(n) time without using the division operation?

*/

class Solution {
	public int[] productExceptSelf(int[] nums) {
		List<Integer> list = new ArrayList<> ();
        	int left = 0, right = nums.length - 1, product = 1;
        	while (left < nums.length) {
            		if (left != right) product *= nums[right];
            		if (right == 0) {
                		list.add(product);
                		product = 1;
                		left++;
            		}
            	right = (right == 0) ? nums.length - 1: right - 1;
        	}
	        int[] result = new int[list.size()];
        	int index = 0;
        	for (int n : list)
            		result[index++] = n;
        	return result;
    	}
}
