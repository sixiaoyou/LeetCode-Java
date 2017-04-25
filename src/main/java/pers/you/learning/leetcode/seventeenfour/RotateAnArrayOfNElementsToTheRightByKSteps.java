package pers.you.learning.leetcode.seventeenfour;

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
