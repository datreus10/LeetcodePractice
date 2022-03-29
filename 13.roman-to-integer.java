/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int result=0;
        int tmp = 0;
        for(int i=0;i<s.length();i++){
            tmp = symToVal(s.charAt(i));
            if(i<s.length()-1 && isSpecial(s.charAt(i),s.charAt(i+1))){
                tmp=-tmp;
            }
            result +=tmp;
        }
        return result;
    }
    private int symToVal(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    private boolean isSpecial(char s1,char s2){
        if(s1=='I' && (s2=='V'||s2=='X'))
            return true;
        if(s1=='X' && (s2=='L'||s2=='C'))
            return true;
        if(s1=='C' && (s2=='D'||s2=='M'))
            return true;
        return false;
    }
}
// @lc code=end

