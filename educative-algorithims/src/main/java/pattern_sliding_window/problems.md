### 8. Longest Subarray with Ones after Replacement (hard)
_Given an array containing 0s and 1s, if you are allowed to 
replace no more than ‘k’ 0s with 1s, find the length of the longest
contiguous subarray having all 1s._

---
#### Example 1:
Input: Array=[0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1], k=2

Output: 6

Explanation: Replace the '0' at index 5 and 8 to have the longest contiguous subarray of 1s having length 6.

#### Example 2:
Input: Array=[0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1], k=3

Output: 9

Explanation: Replace the '0' at index 6, 9, and 10 to have the longest contiguous subarray of 1s having length 9.

---
#### Solution 
This problem follows the Sliding Window pattern and is quite similar to Longest Substring
with same Letters after Replacement. The only difference is that, in the problem, we only 
have two characters (1s and 0s) in the input array_easy.

Following a similar approach, we’ll iterate through the array to add one number at a time 
in the window. We’ll also keep track of the maximum number of repeating 1s in the current 
window (let’s call it maxOnesCount). So at any time, we know that we can have a window
which has 1s repeating maxOnesCount time, so we should try to replace the remaining 0s.
If we have more than ‘k’ remaining 0s, we should shrink the window as we are not allowed to replace more than ‘k’ 0s.

#### [Solution](LongestSubarrayWithOnes.java)

--- 
#### Time Complexity #
The time complexity of the above algorithm will be O(N) where ‘N’ is the count of numbers in the input array.

#### Space Complexity #
The algorithm runs in constant space O(1).


# ----------------------------------------------------------

### 9. Permutation in a String (hard)

#### [LeetCode](https://leetcode.com/problems/permutation-in-string/description/)
#### [Solution](PermutationInAString.java)

# ----------------------------------------------------------


### String Anagrams (hard) #
Given a string and a pattern, find all anagrams of the pattern in the given string.

Anagram is actually a Permutation of a string. For example, “abc” has the following six anagrams:

abc
acb
bac
bca
cab
cba
Write a function to return a list of starting indices of the anagrams of the pattern in the given string.

Example 1:

Input: String="ppqp", Pattern="pq"
Output: [1, 2]
Explanation: The two anagrams of the pattern in the given string are "pq" and "qp".
Example 2:

Input: String="abbcabc", Pattern="abc"
Output: [2, 3, 4]
Explanation: The three anagrams of the pattern in the given string are "bca", "cab", and "abc".

#### [Solution](StringAnagrams.java)

# ----------------------------------------------------------

#### Minimum Window Sort (medium) #
Given an array, find the length of the smallest subarray in it which when sorted will sort the whole array.

Example 1:

Input: [1, 2, 5, 3, 7, 10, 9, 12]
Output: 5
Explanation: We need to sort only the subarray [5, 3, 7, 10, 9] to make the whole array sorted
Example 2:

Input: [1, 3, 2, 0, -1, 7, 10]
Output: 5
Explanation: We need to sort only the subarray [1, 3, 2, 0, -1] to make the whole array sorted
Example 3:

Input: [1, 2, 3]
Output: 0
Explanation: The array is already sorted
Example 4:

Input: [3, 2, 1]
Output: 3
Explanation: The whole array needs to be sorted.

#### [Solution](MinimumWindowSort.java)
