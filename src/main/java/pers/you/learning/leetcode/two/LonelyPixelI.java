/*
LeetCode 531:Lonely Pixel I
Given a picture consisting of black and white pixels, find the number of black lonely pixels.

The picture is represented by a 2D char array consisting of 'B' and 'W', which means black and white pixels respectively.

A black lonely pixel is character 'B' that located at a specific position where the same row and same column don't have any other black pixels.

Example:
Input: 
[['W', 'W', 'B'],
 ['W', 'B', 'W'],
 ['B', 'W', 'W']]

Output: 3
Explanation: All the three 'B's are black lonely pixels.
Note:
The range of width and height of the input 2D array is [1,500].
 */



package pers.you.learning.leetcode.two;

public class LonelyPixelI {

	 public int findLonelyPixel(char[][] picture) {
	        int count=0;
			int sum=0;
			int index=0;
			boolean ok=true;
			for(int i=0;i<picture.length;i++){
				for(int j=0;j<picture[i].length;j++){
					if(picture[i][j]=='B') {
						count+=1;
						index=j;
					}
				}
					if(count==1){
						for(int k=0;k<picture.length;k++){
							if(k!=i&&picture[k][index]=='B'){
								ok=false;
								break;
							}
						}
						if(ok){
							sum+=1;
						}
					}
					ok=true;
					count=0;
				}
	            return sum;
	    	}
}
