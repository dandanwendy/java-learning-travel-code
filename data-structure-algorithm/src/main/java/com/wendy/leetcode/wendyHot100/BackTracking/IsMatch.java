package com.wendy.leetcode.wendyHot100.BackTracking;

public class IsMatch {
    public static void main(String[] args) {
        String text = "aa";
        String pattern = "a**";
        System.out.println(isMatch(text,pattern));
        //System.out.println(false && false);
    }

    public static boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) ||
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

}
