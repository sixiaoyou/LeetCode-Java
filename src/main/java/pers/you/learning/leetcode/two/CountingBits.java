	/*
	 Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

	Example:
	For num = 5 you should return [0,1,1,2,1,2].

	Follow up:

	It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
	Space complexity should be O(n).
	Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
	 */
package pers.you.learning.leetcode.two;


	public class CountingBits{
		    public int[] countBitsV1(int num) {
			int count=0;
			int[] returnArray =new int[num+1];
			for(int i=0;i<num+1;i++){
				String binaryNum=Integer.toBinaryString(i);
				char[] charNum = binaryNum.toCharArray();
				for(int j=0;j<charNum.length;j++){
					if(charNum[j]=='1'){
						count+=1;
					}
				}
				returnArray[i]=count;
				count=0;
			}
			return returnArray;
		}
		    
		    
		    public int[] countBitsV2(int num) {
				int[] returnArray=new int[num+1];
				returnArray[0]=0;
				for(int i=1;i<num+1;i++){
					returnArray[i]=returnArray[i&(i-1)]+1;
				}
			        return returnArray;
		     
			}
	}
