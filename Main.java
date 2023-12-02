package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println((new Solution()).lengthOfLongestSubstring(s));
    }
}

class Solution{
    public int lengthOfLongestSubstring(String s){
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(s.charAt(i))){
                left = Math.max(left, hashMap.get(s.charAt(i)) + 1);
            }
            hashMap.put(s.charAt(i), i);
            max = Math.max(max, i-left+1);
        }
        return max;
    }
}
