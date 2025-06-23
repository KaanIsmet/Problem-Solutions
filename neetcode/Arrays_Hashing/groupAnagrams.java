/*Group Anagrams
  Solved 
  Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

  An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

*/


class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map = new HashMap<> ();
		String key;
		char[] chars;
		for (String str : strs) {
			chars = str.toCharArray();
			Arrays.sort();
			key = new String(chars);
			if (map.containsKey(key)) {
				List<String> list = map.get;
				list.add(str);
				map.remove(key);
				map.put(key, list);
			}
			else {
				List<String> list = new ArrayList<> ();
				list.add(str);
				map.put(key, list);
			}
		}
		return new ArrayList<> (map.values());
	}
}


