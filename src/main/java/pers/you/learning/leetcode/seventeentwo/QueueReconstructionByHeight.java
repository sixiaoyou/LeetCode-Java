/*
LeetCode 406:Queue Reconstruction by Height
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

Example

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */

package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.List;



public class QueueReconstructionByHeight{
	 public void swap(int[][] people,int a,int b){
	       int t1=people[a][0];
	       int t2=people[a][1];
	       people[a][0]=people[b][0];
	       people[a][1]=people[b][1];
	       people[b][0]=t1;
	       people[b][1]=t2;
	   }
	   public int[][] reconstructQueue(int[][] people){
	       int n=people.length;
	       for(int i=0;i<n;i++){
	           for(int j=i+1;j<n;j++){
	               if(people[i][0]<people[j][0]){
	                   swap(people,i,j);
	               }
	               else if(people[i][0]==people[j][0] && people[i][1]>people[j][1]){
	                   swap(people,i,j);
	               }
	           }
	       }
	        List<Integer> la = new ArrayList<Integer>();
	        List<Integer> lb = new ArrayList<Integer>();
	        
	        for(int i=0;i<n;i++){
	            la.add(people[i][1],people[i][0]);
	            lb.add(people[i][1],people[i][1]);
	        }
	        for(int j=0;j<n;j++){
	            people[j][0]=la.get(j);
	            people[j][1]=lb.get(j);
	        }
	        return people;
	   }
	    
}
