package pers.you.learning.leetcode.seventeennine;

/*
'''
LeetCode661. Image Smoother
Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.

Example 1:
Input:
[[1,1,1],
 [1,0,1],
 [1,1,1]]
Output:
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
Explanation:
For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
For the point (1,1): floor(8/9) = floor(0.88888889) = 0
Note:
The value in the given matrix is in the range of [0, 255].
The length and width of the given matrix are in the range of [1, 150].
'''
 */

public class ImageSmoother {
    
//    #【网友实现】:http://bookshadow.com/weblog/2017/08/21/leetcode-image-smoother/
    public int[][] imageSmootherV1(int[][] M) {
        int[] dx = {-1,0,1},dy = {-1,0,1};
        int lm = M.length,ln = M[0].length;
        int[][] N = new int[lm][ln];
        for(int x = 0;x<lm;x++){
            int[] row = new int[ln];
            for(int y = 0;y<ln;y++){
                int sum = 0,count = 0;
                for(Integer i:dx){
                    for(Integer j:dy){
                        if(x+i>=0&&x+i<lm&&y+j>=0&&y+j<ln){
                            sum+=M[x+i][y+j];
                            count+=1;
                        }
                    }
                }
                  row[y]=sum/count;
            }
            N[x] = row;
        }
        return N;   
    }
    
    public int[][] imageSmootherV2(int[][] M) {
        int lm = M.length,li = M[0].length;
           int[][] N = new int[lm][li];
           for(int i = 0;i<lm;i++){
               for(int j = 0;j<li;j++){
                   if(i == 0){
                          if(j == 0){
                              if(j == li - 1){
                                  if(i == lm - 1){
                                          return M;
                                  }
                                  else{
                                      N[i][j] = (M[i][j]+M[i+1][j])/2;
                                  }
                              }
                              else{
                                  if(i == lm - 1){
                                      N[i][j] = (M[i][j]+M[i][j+1])/2;
                                  }
                                  else{
                                      N[i][j] = (M[i][j]+M[i][j+1]+M[i+1][j]+M[i+1][j+1])/4;
                                  }
                              }
                          }   
                          else if(j == li - 1){
                              if(i == lm - 1){ 
                                  N[i][j] = (M[i][j]+M[i][j-1])/2;
                              }
                              else{
                                  N[i][j] = (M[i][j]+M[i][j-1]+M[i+1][j]+M[i+1][j-1])/4;
                              }
                          }
                          else{
                              if(i == lm - 1){
                                  N[i][j]=(M[i][j]+M[i][j-1]+M[i][j+1])/3;
                              }
                              else{
                                  N[i][j] = (M[i][j]+M[i][j-1]+M[i][j+1]+M[i+1][j]+M[i+1][j-1]+M[i+1][j+1])/6;
                              }
                          }
                   }
                   else if(i == lm - 1){
                       if(j == 0){
                           if(li == 1){
                               N[i][j] = (M[i][j]+M[i-1][j])/2;
                           }
                           else{
                               N[i][j] = (M[i][j]+M[i][j+1]+M[i-1][j]+M[i-1][j+1])/4;
                           }
                       }
                       else if(j == li - 1){
                           N[i][j] = (M[i][j]+M[i][j-1]+M[i-1][j]+M[i-1][j-1])/4;
                       }
                       else{
                           N[i][j] = (M[i][j]+M[i][j-1]+M[i][j+1]+M[i-1][j]+M[i-1][j-1]+M[i-1][j+1])/6;
                       }
                   }
                    else{
                        if(j == 0){
                            if(li == 1){
                                N[i][j] = (M[i][j]+M[i-1][j]+M[i+1][j])/3;
                            }
                            else{
                                N[i][j] = (M[i][j]+M[i][j+1]+M[i+1][j]+M[i+1][j+1]+M[i-1][j]+M[i-1][j+1])/6;
                            }
                        }
                        else if(j == li - 1){
                                N[i][j] = (M[i][j]+M[i][j-1]+M[i+1][j]+M[i-1][j]+M[i+1][j-1]+M[i-1][j-1])/6;
                        }
                        else{
                            N[i][j] = (M[i][j]+M[i][j-1]+M[i][j+1]+M[i+1][j]+M[i+1][j-1]+M[i+1][j+1]+M[i-1][j]+M[i-1][j-1]+M[i-1][j+1])/9;
                        }
                    }
               }
           }
                 return N;
   }
}
