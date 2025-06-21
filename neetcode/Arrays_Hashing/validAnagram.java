/* Valid Anagram
 *
 * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
 *
 *
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 *
 * Two pointer method or Sorting can be used to solve this problem.
 */



class Solution {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) return false;
		char[] sChars = s.toCharArray(), tChars = t.toCharArray();
		Arrays.sort(sChars);
		Arrays.sort(tChars);
		int left = 0, right = 0;

		while (left < s.length()) 
			if (sChars[left] != tChars[right]) return false;
		return true;
		/* Using a String built-in function to solve this problem
		 * s = new String(sChars);
		 * t = new String(tChars);
		 * return s.equals(t);
		 */
	}
}
