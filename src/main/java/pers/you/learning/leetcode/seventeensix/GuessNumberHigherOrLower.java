package pers.you.learning.leetcode.seventeensix;
/*
【网友实现】:http://blog.csdn.net/MebiuW/article/details/51898562
LeetCode374. Guess Number Higher or Lower
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example:
n = 10, I pick 6.

Return 6.
 */


public class GuessNumberHigherOrLower {
    /* The guess API is defined in the parent class GuessGame.
    @param num, your guess
    @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
       int guess(int num); 
     */

    
 public class Solution extends GuessGame {
     public int guessNumber(int n) {
         int i = 1;
         int j = n;
         int mid;
         int compare;
         while(i<j){
             mid = i/2+j/2;
             compare = guess(mid);
             if(compare == 0){
                 return mid;
             }else if(compare == 1){
                 i = mid + 1;
             }else{
                 j = mid - 1;
             }
        
         }
          return i;
     }
 }
}
