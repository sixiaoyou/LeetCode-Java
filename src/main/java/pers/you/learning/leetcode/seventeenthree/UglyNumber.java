/*
'''
LeetCode 263:Ugly Number
Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.
'''
 */



package pers.you.learning.leetcode.seventeenthree;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

public class UglyNumber {

    //网友实现:http://bookshadow.com/weblog/2015/08/19/leetcode-ugly-number/
    public boolean isUglyV1(int num) {
        if (num < 1) {
            return false;
        } else {
            int[] nums = { 2, 3, 5 };
            for (Integer i : nums) {
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
        return num == 1;
    }
    
    public boolean isUglyV2(int num) {
        if (num < 1) {
            return false;
        }
        else if(num==1){
            return true;
        }
        else {
            if(num%2!=0&&num%3!=0&&num%5!=0){
                return false;
            }
            else{
                List<Integer> list = new ArrayList<Integer>();
                while(num%2==0||num%3==0||num%5==0){
                    if(num%2==0){
                        num/=2;
                        list.add(num);
                    }
                    else if(num%3==0){
                        num/=3;
                        list.add(num);
                    }
                    else{
                        num/=5;
                        list.add(num);
                    }
                }
                for(Integer i : list){
                    if(i%2!=0&&i%3!=0&&i%5!=0&&i!=1){
                        return false;
                    }
                } 
                return true;
            }  
        }
    }

    public void UglyNumberTestCase(int num){
        System.out.println(isUglyV1(num));
        System.out.println(isUglyV2(num));
    }
    
    public UglyNumber(int num) {
        UglyNumberTestCase(num);
    }

    public static void main(String[] args) {
        UglyNumber isUglyNumber = new UglyNumber(42);
    }
}