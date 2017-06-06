package pers.you.learning.leetcode.seventeensix;

import java.util.Random;

public class GuessGame {
    
    Random ra = new Random();
    public int guess(int num){
        int myNumber = ra.nextInt();
        if(num==myNumber){
            return 0;
        }else if(num<myNumber){
            return 1;
        }else{
            return -1;
        }
    }
}
