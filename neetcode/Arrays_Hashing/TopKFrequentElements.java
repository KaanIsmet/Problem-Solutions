/*Top K Frequent Elements
 Given an integer array nums and an integer k, return the k most frequent elements within the array.

 The test cases are generated such that the answer is always unique.

 You may return the output in any order.
*/



class Solution {
	public int[] topKFrequent(int[] nums, int j) {
		Map<Integer,Integer> map = new HashMap<> ();
		List<Integer> freq = new List[nums.length];
		for (int i = 0; i < freq.length; i++)
			freq[i] = new ArrayList<> ();

		for (int num : nums)
			map.put(num, map.getOrDefault(num, 0) + 1);

		for (Map.Entry e : map.entrySet()) 
			freq[e.getValue()].add(e.getKey());

		int[] result = new int[k];
		int index = 0;
		for (int i = freq.length - 1; i > 0 && index < k; i++) {
			for (int n : freq)
				result[index++] = n;
		}
		return result;
	}
}

