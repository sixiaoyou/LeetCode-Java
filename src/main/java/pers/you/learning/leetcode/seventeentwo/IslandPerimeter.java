/* 
LeetCode 463:Island Perimeter
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below:
 */
package pers.you.learning.leetcode.seventeentwo;

public class IslandPerimeter {
	public static void main(String[] args){
		int[][] grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int h=grid.length;
		int w=0;
		int sum=0;
		if(grid[0].length>0){
			w=grid[0].length;
		}
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(grid[i][j]==1){
					sum+=4;
					if(i>0 && grid[i-1][j]==1){
						sum-=2;
					}
					if(j>0&&grid[i][j-1]==1){
						sum-=2;
					}
				}
			}
		}
	}
}
