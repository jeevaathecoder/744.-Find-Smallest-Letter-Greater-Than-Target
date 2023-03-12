
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

//Example 1
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

//Example 2
//Input: letters = ["c","f","j"], target = "c"
//        Output: "f"
//        Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {

            int start=0;
            int end=letters.length-1;

            while(start<=end){
                int mid = start + (end-start)/2;

                if(target<letters[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
            return letters[start % letters.length];
        }
    }
