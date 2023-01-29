package Leetcode.george.part02;

import java.util.HashSet;

public class Leet_2062 {
    public static void main(String[] args) {
        int result = countVowelSubstrings("cuaieuouac");
    }
    public static int countVowelSubstrings(String word) {
        int ans = 0;
        int len = word.length();
        if(len < 5){
            return 0;
        }
        for(int i=0;i<len;i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<len;j++){
                if(!isVowel(word.charAt(j))){
                    break;
                }
                set.add(word.charAt(j));
                if(set.size()==5)
                    ans++;
            }
        }
        return ans;
    }

    private static boolean isVowel(char ch) {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
