package pers.you.learning.leetcode.seventeenfour;

/*
【极客学院版】
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Related problem: Reverse Words in a String II
 */



public class RotateAnArrayOfNElementsToTheRightByKSteps {
    public void swap(int[] array,int a,int b){
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
    
    public void reverse(int[] array,int start,int end){
        if(array==null||array.length<=1){
            return;
        }
        int n = array.length;
        for(int i=start,j=end;i<j;i++,j--){
            swap(array,i,j);
        }
    }

    public void rotate(int[] nums, int k) {
        if(k==0){
            return;
        }
        int n = nums.length;
        if(k>=n){
          k=k%n;  
        }
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}
