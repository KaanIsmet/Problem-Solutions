/*Two Sum
 * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

   You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

   Return the answer with the smaller index first.

*/



class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<> ();
		int complement;
		for (int i = 0; i < nums.length; i) {
			complement = target - nums[i];
			if (map.containsKey(complement)) return new int[] {map.get(complement), i};
			
			else map.put(nums[i], i);
		}
		return new int[] {};
	}
}
