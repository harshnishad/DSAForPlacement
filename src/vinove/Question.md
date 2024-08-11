Q1. Maximum Subarray Sum
Given an array of numbers, find the maximum sum of any contiguous subarray of the array.
For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.
Given the array [-5, -1, -8, -9], the maximum sum would be -1.
Follow up: Do this in O(N) time.
Input Format:
The first line of input contains size of array, which is denoted by N and second line of input contains N space separated integers.
Output Format:
The first and only line of output should print the maximum subarray sum, as described in the description.

Q2. String Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters.
Palindrome
A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
Example:
If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome. The expected output for this example will print, 'true'.
From that being said, you are required to return a boolean value from the function that has been asked to implement.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false'.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6 Where N is the length of the input string. Time Limit: 1 sec


Q3. Permutations of a String
You are given a string 'STR' consisting of lowercase English letters. Your task is to return all permutations of the given string in lexicographically increasing order.
String A is lexicographically less than string B, if either A is a prefix of B (and A ≠ B), or there exists such i (1 <= i <= min(|A|, |B|)), that A[i] < B[i], and for any j (1 <= j < i) A[i] = B[i]. Here |A| denotes the length of the string A.
For example :
If the string is “bca”, then its permutations in lexicographically increasing order are { “abc”, “acb”, “bac”, “bca”, “cab”, “cba” }.
Note:
Given string contains unique characters.
Input Format :
The first line of input contains a single integer 'T', representing the number of test cases or queries to be run. Then the T test cases follow. The first line and only line of each test case contains a string 'STR' consisting of lowercase English letters.
Output Format :
For every test case, the permutations of the given string are printed in lexicographically increasing order separated by space. The output of each test case is printed in a separate line.
Note :
You do not need to print anything, it has already been taken care of. Just implement the given function.
Constraints :
1 <= T <= 5 1 <= |STR| <= 9 Where |STR| is the length of the string. Time Limit: 1 sec